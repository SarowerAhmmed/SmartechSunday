package com.generic.library;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.config.ObjectMap;
import com.master.pagefactory.MasterPageFactory;
import com.report.ExtentReport;
import com.util.HighLighter;
import com.util.TakeScreenShot;

public class BaseLoginTestng extends ExtentReport {
	private WebDriver driver;
	private MasterPageFactory pf;
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		// chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);// upcasting
		driver.manage().window().maximize();// maximum size
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// HTML load
	}

	@Test
	public void loginGCR() throws Throwable {

		ObjectMap obj = new ObjectMap();

		driver.get(obj.getconfig("URL"));
		 pf = PageFactory.initElements(driver, MasterPageFactory.class);

		HighLighter.color(driver, pf.getMyaccount());
		pf.getMyaccount().click();

		pf.getEmail().sendKeys(obj.getconfig("Name"));
		HighLighter.color(driver, pf.getEmail());
		pf.getPassword().sendKeys(obj.getconfig("Password"));

		HighLighter.color(driver, pf.getPassword());
		pf.getPassword().submit();

		
	}
	@Test(dependsOnMethods = "loginGCR")
	public void gcrCart() {
		HighLighter.color(driver, pf.getCataLog());
		pf.getCataLog().click();
		HighLighter.color(driver, pf.getNewProduct());
		pf.getNewProduct().click();
	
		List<String> allproduct=new ArrayList<>();
		
			for(int i =0;i<pf.getPageNumber().size();i++) {
				
				pf.getPageNumber().get(i).click();
				for(int j =0;j<pf.getAllProductName().size();j++) {
					
					//System.out.println(pf.getAllProductName().get(j).getText());
					allproduct.add(pf.getAllProductName().get(j).getText());
				}

			}
		
			System.out.println("All product fron GCR shope::"+allproduct);
			Set<String> noDuplicateProduct= new HashSet<>(allproduct);
			System.out.println("Without duplicate product fron GCR shope::"+noDuplicateProduct);
			List<String> countItems=new ArrayList<>();	
			
			for(String item:allproduct) {
				
				//System.out.println(item+" count::"+Collections.frequency(allproduct, item));
				countItems.add(item+" count::"+Collections.frequency(allproduct, item));
			}
			
			Set<String> noDuplicateCount= new HashSet<>(countItems);
			System.out.println("Count of items fron GCR shope::"+noDuplicateCount);
			
			String [] allPrice= {"$10.27","$102.27","$233.27","$333.33","$233.27","$333.33","$4,000.40","$10.27"};	
			
			
		List<Double> allPriceList=new ArrayList<>();		
		for(String price:allPrice) {
			String s=price.replace("$", "").replace(",", "");
			System.out.println(s);
			allPriceList.add(Double.parseDouble(s));
			
		}
		
			System.out.println("All price::"+allPriceList);
			
			System.out.println("Max price::"+Collections.max(allPriceList));
			System.out.println("Min price::"+Collections.min(allPriceList));
			Set<Double> noDuplicatePrice= new HashSet<>(allPriceList);
			System.out.println("Without duplicate price::"+noDuplicatePrice);
		driver.quit();
	}
	@Test(dependsOnMethods = "gcrCart")
	public void WebTable() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();// upcasting
		driver.manage().window().maximize();
		driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
		
		
		
		
		  // Header print 
		WebElement allHeadersOfTable =driver.findElement(By.xpath("//table//thead"));
		  System.out.println("Headers in table are below:"); 
		  System.out.println("Header of Table::"+allHeadersOfTable.getText());
		
		  // No.of rows 
		  List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")); 
		  System.out.println("No of rows are : " + rows.size());
		  
		
		  // 1st row 
		  WebElement firstRow = driver .findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]"));
		
		  System.out.println("1st row::"+firstRow.getText());
		  
		// Last row 
		  WebElement lastRow = driver .findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+rows.size()+"]"));
		
		  System.out.println("Last row::"+lastRow.getText());
		 
		  System.out.println("Below my whole table::");
		 
//		  for(int i =0;i<= rows.size() ;i++) {
//			  
//			  
//			  System.out.println(rows.get(i).getText());
//			  
//			  //code
//		  }
		  
		
	}

	@AfterTest
	public void teardown() {

		driver.quit();

	}

}
