package com.bangladesh.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.bangladesh.Util.TestBase_BD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/recources/Featuresssss"} , 
plugin = {"json:target/cucumber.json"},
glue = "com.bangladesh.StepDepBD",tags= "@BD1")

public class TestRunner_BD extends AbstractTestNGCucumberTests {
	
	@BeforeTest
	public void LaunchApplicationURL(){
		TestBase_BD lunch = new TestBase_BD();
		lunch.initz();
	}
	@AfterTest
	public void CloseApplicationURL() {
		TestBase_BD.driver.quit();

	}
}
