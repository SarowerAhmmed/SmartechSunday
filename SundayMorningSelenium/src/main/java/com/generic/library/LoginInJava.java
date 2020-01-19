package com.generic.library;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.config.ObjectMap;
import com.master.pagefactory.MasterPageFactory;
import com.util.HighLighter;

public class LoginInJava {
	static ObjectMap obj = new ObjectMap();
	public static void getLogin(WebDriver driver) throws Throwable {
		
		
		//PropertyConfigurator.configure("Log4j.properties");
		driver.get(obj.getconfig("URL"));
		MasterPageFactory pf = PageFactory.initElements(driver, MasterPageFactory.class);

	
		HighLighter.color(driver, pf.getMyaccount());
		//pf.getMyaccount().click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", pf.getMyaccount());
		
		/*
		 * //pf.getEmail().sendKeys(obj.getconfig("Name"));
		 * 
		 * 
		 * executor.executeScript("arguments[0].value='"+ obj.getconfig("Name") +"';",
		 * pf.getEmail()); //HighLighter.color(driver, pf.getEmail());
		 * //pf.getPassword().sendKeys(obj.getconfig("Password"));
		 * executor.executeScript("arguments[0].value='"+ obj.getconfig("Password")
		 * +"';", pf.getPassword()); // TakeScreenShot.captureScreenShot(driver,
		 * "GCRSHOP during login"); //HighLighter.color(driver, pf.getPassword());
		 * pf.getPassword().submit();
		 */

		  try {
			  Runtime.getRuntime().exec("taskkill /IM iexplore.exe /F");
			  Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe/F");
			  } catch (IOException e) {
			  e.printStackTrace();
			  }
		driver.quit();
		
		
	}
	
}
