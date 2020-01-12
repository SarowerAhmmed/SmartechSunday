package com.generic.library;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.config.ObjectMap;
import com.db.util.connect.DatabaseList;
import com.excelFactory.Excelcreater;
import com.master.pagefactory.MasterPageFactory;
import com.report.ExtentReport;
import com.util.HighLighter;
import com.util.TakeScreenShot;

public class BaseLogin extends ExtentReport {

	Logger logger = Logger.getLogger("BaseLogin");
	ObjectMap obj = new ObjectMap();
	String path= "./Test cases/Test_Result.xlsx";
	//List<String> testData= new ArrayList<>();
	
	
	@Test
	public void login() throws Throwable {
		//DatabaseList.delecteTable();
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		//chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);// upcasting
		driver.manage().window().maximize();// maximum size
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// HTML load
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Browser Opened");
		DatabaseList.testResult("TC_001", "opened browser", "Brwoser should open",
				"Opened my Browser", "Passed");
		String [] data= {"TC_001", "opened browser", "Brwoser should open",
				"Opened my Browser", "Passed"};
		Excelcreater.wtireContecnt(path, data);
		
		driver.get(obj.getconfig("URL"));
		MasterPageFactory pf = PageFactory.initElements(driver, MasterPageFactory.class);
		test.log(test.getStatus(), "Home page");
		logger.info("Home page");
		DatabaseList.testResult("TC_002", "Pass URL", "Home page",
				"Came Home page", "Passed");
		HighLighter.color(driver, pf.getMyaccount());
		pf.getMyaccount().click();
		test.log(test.getStatus(), "Login page");
		pf.getEmail().sendKeys(obj.getconfig("Name"));
		HighLighter.color(driver, pf.getEmail());
		pf.getPassword().sendKeys(obj.getconfig("Password"));
		test.log(Status.PASS, "Passed GCR Login page found"
				+ test.addScreenCaptureFromPath(TakeScreenShot.captureScreenShot(driver, "GCRSHOP login page")));
		// TakeScreenShot.captureScreenShot(driver, "GCRSHOP during login");
		HighLighter.color(driver, pf.getPassword());
		pf.getPassword().submit();
		test.log(test.getStatus(), "Login done");

		test.log(Status.PASS, "Passed GCR Login"
				+ test.addScreenCaptureFromPath(TakeScreenShot.captureScreenShot(driver, "GCRSHOP login Success")));
		logger.info("Login test passed");
		// TakeScreenShot.captureScreenShot(driver, "GCRSHOP login page");
		DatabaseList.testResult("TC_003", "Login check", "login should pass",
				"Login Success", "Passed");
		driver.quit();
		test.log(Status.PASS, "Browser closed");
		DatabaseList.testResult("TC_004", "finish test", "Closed browser",
				"Browser closed", "Passed");
		logger.debug("I am debug log");
		logger.fatal("I am fatal log");
		// long id = Thread.currentThread().getId();
	      //  System.out.println("Sample test-method One. Thread id is: " + id);
	}

}
