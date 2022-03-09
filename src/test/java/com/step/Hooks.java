package com.step;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	private void beforeScenario() {	
	 browser();
	 loadurl("https://adactinhotelapp.com/");

	}
	
	@After
	private void afterScenario(Scenario s) {
	TakesScreenshot tk = (TakesScreenshot) driver;
	byte[] bs = tk.getScreenshotAs(OutputType.BYTES);
	s.embed(bs, "img//png");
		quit();
	

	}

}
