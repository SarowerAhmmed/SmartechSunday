package com.master.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {
	

	@FindBy(xpath = "(//*[@class='ui-button-text'])[3]")
	private WebElement myaccount;
	@FindBy(xpath = "//*[@name='email_address']")
	private WebElement email;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	@FindBy(xpath = "//*[contains(text(),'Catalog')]")
	private WebElement cataLog;
	@FindBy(xpath = "//*[contains(text(),'new products')]")
	private WebElement newProduct;
	@FindBy(xpath = "//strong/u")
	private List<WebElement> allProductName;
	@FindBy(xpath = "//*[(contains(@class, 'pageResults'))]/u")
	private List<WebElement> pageNumber;

	public WebElement getMyaccount() {
		return myaccount;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getCataLog() {
		return cataLog;
	}
	public WebElement getNewProduct() {
		return newProduct;
	}
	public List<WebElement> getAllProductName() {
		return allProductName;
	}
	public List<WebElement> getPageNumber() {
		return pageNumber;
	}
	
	
	
	
	
}