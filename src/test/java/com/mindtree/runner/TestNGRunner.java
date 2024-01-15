package com.mindtree.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/", glue = {"com.mindtree.stepdef"}, 
tags= "@loginToAccount",monochrome = true,plugin = {"pretty", "html:target/cucumber.html" ,"json:target/cucumber.json"})
public class TestNGRunner extends AbstractTestNGCucumberTests {     

}
