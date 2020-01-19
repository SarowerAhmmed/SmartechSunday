package com.runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(plugin = {
		"pretty",
        "html:target/site/cucumber-pretty",
        "rerun:target/rerun.txt",
        "json:target/cucumber2.json" ,
	"com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html" 
        },

		snippets = SnippetType.CAMELCASE,

		features = {"src/main/resources/GCRLoginOutLine2.feature"},
		glue = { "com.stepdef" }, // stepdef code location
																							// package name
		// tags= {"@Regression"},
		monochrome = true, strict = true, dryRun = false)

public class TestNgRunner2 extends AbstractTestNGCucumberTests {

	private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() throws Exception {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider(parallel = true)
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
		
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDownClass() throws Exception {
		testNGCucumberRunner.finish();
//		Reporter.loadXMLConfig("./CucumberExtentReport.xml");
//		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
//		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
//		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
//		Reporter.setSystemInfo("Selenium", "3.7.0");
//		Reporter.setSystemInfo("Maven", "3.5.2");
//		Reporter.setSystemInfo("Java Version", "1.8.0_151");
		
	}

	@AfterTest
	public static void teardown() throws Throwable {
		
	}
}
