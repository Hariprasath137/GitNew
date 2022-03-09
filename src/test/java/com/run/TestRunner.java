package com.run;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",glue="com.step",plugin= {"junit:src\\test\\resources\\Report\\sample.xml","html:src\\test\\resources\\Report","json:src\\test\\resources\\Adactin.json"})
public class TestRunner {
	
	@AfterClass
	private void after() {
		
		
	
	}

	
}
