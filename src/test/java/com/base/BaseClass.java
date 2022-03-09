package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void browser() {
		
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	}
	public static void loadurl(String url) {
	 
	driver.get(url);	
		
	}
	
	public static void attribute(WebElement Element,String Value) {
	String attribute = Element.getAttribute(Value);
	
	}
	
	public static void type(WebElement Element,String keys) {
	Element.sendKeys(keys);

	}
	public static void btnclick(WebElement element) {
	element.click();

	}
	
	public static void quit() {
	driver.quit();

	}
	
	

}
