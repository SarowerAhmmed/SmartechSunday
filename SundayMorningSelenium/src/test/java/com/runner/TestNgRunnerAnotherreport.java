package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;


@CucumberOptions(plugin = { "pretty", "html:target/site/cucumber-pretty", "rerun:target/rerun.txt",
		"json:target/cucumber1.json",
		"com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html" },

		snippets = SnippetType.CAMELCASE,

		features = { "src/main/resources/GCRLoginOutLine.feature" }, glue = { "com.stepdef" }, // stepdef code location
																								// package name
		// tags= {"@Regression"},
		monochrome = true, strict = true, dryRun = false)
public class TestNgRunnerAnotherreport {
}