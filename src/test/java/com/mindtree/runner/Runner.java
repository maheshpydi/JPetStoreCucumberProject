package com.mindtree.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber.html", "json:target/cucumber.json",
		"junit:target/cucumber.xml" },

		features = { "src/test/resources/features/" }, glue = {
				"com.mindtree.stepdef" }, monochrome = true, tags = "@addToCart"

)
public class Runner {

}
