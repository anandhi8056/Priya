package Junit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Testing/test.feature",
glue={"Stepdefinition"},
plugin = {"pretty","html:target/cucumber-report-html"},
dryRun=false,
monochrome = true,
tags="@All")

public class Runner {

}
