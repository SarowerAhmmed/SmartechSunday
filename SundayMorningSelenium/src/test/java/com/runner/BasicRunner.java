package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;



	@CucumberOptions(plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
			"json:target/cucumber1.json" }, 
			snippets = SnippetType.CAMELCASE, 
			features = {"src/test/resources/GCRLoginScenarioNo1.feature" },
			glue = { "com.stepdef" } // package name
	)

	public class BasicRunner extends AbstractTestNGCucumberTests {

	
}
