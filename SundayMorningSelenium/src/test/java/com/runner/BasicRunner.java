package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
			"json:target/cucumber.json" }, 
			
			features = {"src/test/resources/Login.feature" },
			glue = { "com.stepdef" } // package name
	)

	public class BasicRunner extends AbstractTestNGCucumberTests {

	
}
