package com.java.interview.code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeBtableLastRowFetching {
	public static void main(String[] args) {
		WebDriver driver;
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
		  WebElement lastRow = driver .findElement(By.xpath("//table/tbody/tr["+rows.size()+"]"));
		
		  System.out.println("Last row::"+lastRow.getText());
		 
		  System.out.println("Below my whole table::");
		 
		  for(int i =0;i<= rows.size() ;i++) {
			  
			  
			  System.out.println(rows.get(i).getText());
			  
			  //code
		  }
		  
		  
		  driver.close();
		 
		
		 
	}
}
