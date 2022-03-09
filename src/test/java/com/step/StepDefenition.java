package com.step;

import com.base.BaseClass;
import com.pojo.PojoClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition extends BaseClass{
	
	
	@Given("User Launch the Adactin Web browser")
	public void user_Launch_the_Adactin_Web_browser() {
	   browser();
	   loadurl("https://adactinhotelapp.com/");
	}

	@When("User Enter the Valid {string} and {string} And Click login button")
	public void user_Enter_the_Valid_and_And_Click_login_button(String string, String string2) {
		PojoClass P = new PojoClass();
	    type(P.getUser(),string);
	    type(P.getPass(), string2);
	    btnclick(P.getLog());
	    
	}

	@Then("User verify the Login page Displayed")
	public void user_verify_the_Login_page_Displayed() {
	   System.out.println("Output came");
		System.out.println("New GIT project Successfully Completed");
	}

}