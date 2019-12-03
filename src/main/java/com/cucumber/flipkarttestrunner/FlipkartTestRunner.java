package com.cucumber.flipkarttestrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "E:\\Cucumber Practice\\loginpages\\src\\main\\java\\com\\cucumber\\flipkartfeature\\flipkartfeature.feature",
		glue = {"com.cucumber.flipkartstepdefinition"},
		dryRun = false,
		monochrome = true,
		format = {"pretty","html:resultant","json:json_result/resultant"}
		)
public class FlipkartTestRunner {

}
