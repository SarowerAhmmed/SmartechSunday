package com.runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
		"json:target/cucumber1.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html" },

		snippets = SnippetType.CAMELCASE,

		features = { "src/main/resources/GCRLoginOutLine.feature" }, glue = { "com.stepdef" }, // stepdef code location
																								// package name
		// tags= {"@Regression"},
		monochrome = true, strict = true, dryRun = false)

public class TestNgRunner extends AbstractTestNGCucumberTests {

	
}
