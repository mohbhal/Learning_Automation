package com.cucumber.api.runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\main\\java\\com\\cucumber\\api\\features\\Demo.feature"},
		glue = {"com.cucumber.api.stepdefination","com.cucumber.api.hooks"},
		
		
		monochrome = true
		
		)

public class DemoRunner {

}
