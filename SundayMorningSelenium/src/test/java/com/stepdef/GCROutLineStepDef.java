//
//package com.stepdef;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.PageFactory;
//
//import com.master.pagefactory.MasterPageFactory;
//import com.runner.TestNgRunner;
//
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class GCROutLineStepDef extends TestNgRunner {
//
//	static WebDriver driver;
//	MasterPageFactory pf;
//
//	@Before()
//	public static void startup(Scenario scenario) throws Throwable { //
//		System.out.println(scenario.getName() + ">>>>>>>>>>>>>>>>Scenario started");
//		System.out.println("**************************");
//		System.out.println("STARTED TEST:: " + scenario.getId().split(";")[0] + "::" + scenario.getId().split(";")[1]);
//		System.out.println("**************************");
//
//		// System.out.println(scenario.getStatus()+">>>>>>>>>>>>>>>>");
//
//	}
//
//	@After
//	public static void teardown(Scenario scenario) throws Throwable {
//		System.out.println("**************************");
//		System.out.println(" END TEST ::" + scenario.getId().split(";")[0] + "::" + scenario.getId().split(";")[1]);
//		System.out.println("**************************");
//
//	}
//
//	@Given("^User able to open any browser$")
//	public void user_able_to_open_any_browser() {
//		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
//		//ChromeOptions chromeOptions = new ChromeOptions(); //
//		//chromeOptions.addArguments("--headless");
//		//driver = new ChromeDriver(chromeOptions);// upcasting
//		driver =new ChromeDriver();
//		driver.manage().window().maximize();// maximum size
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// HTML load
//	}
//
//	@Given("^Put \"([^\"]*)\" and go to login page$")
//	public void put_and_go_to_login_page(String url) throws Throwable { // List<List<String>>
//		// list = table.raw(); // driver.get(list.get(1).get(0));
//
//		driver.get(url);
//		System.out.println(driver.getTitle());
//	}
//
//	@When("^User able to click my account$")
//	public void user_able_to_click_my_account() {
//		pf = PageFactory.initElements(driver, MasterPageFactory.class);
//		pf.getMyaccount().click();
//
//	}
//
//	@When("^User able to use valid \"([^\"]*)\"$")
//	public void user_able_to_use_valid(String email) throws Throwable {
//
//		// List<List<String>> list = table.raw(); // //
//
//		pf.getEmail().sendKeys(email);
//
//	}
//
//	@When("^User able to put valid  \"([^\"]*)\"$")
//	public void user_able_to_put_valid(String pass) throws Throwable {
//
//		// List<List<String>> list = table.raw();
//
//		pf.getPassword().sendKeys(pass);
//	}
//
//	@When("^User able to click submit button$")
//	public void user_able_to_click_submit_button() {
//		pf.getPassword().submit();
//	}
//
//	@Then("^User able to validate Login status$")
//	public void user_able_to_validate_Login_status() {
//		System.out.println(driver.getTitle());
//	}
//	// Assert.assertTrue(pf.getGcrLogout().size() == 1); }
//
//	@Then("^close the browser$")
//	public void close_the_browser() throws Throwable {
//		driver.quit(); // pf.getLogoff().get(0).click();
//
//		Thread.sleep(5000);
//
//	}
//
//}
