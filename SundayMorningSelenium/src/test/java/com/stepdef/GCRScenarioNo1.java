
package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.config.ObjectMap;
import com.master.pagefactory.MasterPageFactory;
import com.util.HighLighter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GCRScenarioNo1 {

	private WebDriver driver;
	private MasterPageFactory pf;
	ObjectMap obj = new ObjectMap();

	@Given("^User need to open a browser$")
	public void user_need_to_open_a_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions(); //
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver(chromeOptions);// upcasting
		driver.manage().window().maximize();// maximum size
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// HTML load
	}

	@Given("^Pass the URL$")
	public void pass_the_URL() throws Throwable {

		driver.get(obj.getconfig("URL"));
		pf = PageFactory.initElements(driver, MasterPageFactory.class);

	}

	@When("^Click my account$")
	public void click_my_account() throws Throwable {
		HighLighter.color(driver, pf.getMyaccount());
		pf.getMyaccount().click();

	}

	@When("^put email$")
	public void put_email() throws Throwable {
		pf.getEmail().sendKeys(obj.getconfig("Name"));
		HighLighter.color(driver, pf.getEmail());

	}

	@When("^put password$")
	public void put_password() throws Throwable {
		pf.getPassword().sendKeys(obj.getconfig("Password"));

		HighLighter.color(driver, pf.getPassword());

	}

	@When("^click sign in button$")
	public void click_sign_in_button() throws Throwable {
		pf.getPassword().submit();
	}

	@Then("^login will be successful$")
	public void login_will_be_successful() throws Throwable {

		driver.quit();
	}

}
