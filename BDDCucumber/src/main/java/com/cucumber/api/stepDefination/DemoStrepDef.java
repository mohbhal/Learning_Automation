package com.cucumber.api.stepDefination;

import com.cucumber.api.common.Base;
import com.cucumber.api.transform.TransformData;

import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoStrepDef {
	
	//1. To create a reference variable in dependentent class
	//2. To initialize ref var via constructor
	
	private Base base;
	public DemoStrepDef(Base base) {
		this.base=base;
	}
	
	@Given("^I should be logged in$")
	public void i_should_be_logged_in() throws Throwable {
		System.out.println("I should be logged in"  + base.getFeatureName());
		System.out.println("I should be logged in"  + base.getScenarioName());
	}

	@Given("^I should be own wall$")
	public void i_should_be_own_wall() throws Throwable {
		System.out.println("I should be own wall$");
	}

	@When("^I type the text as \"([^\"]*)\" on text wall$")
	public void i_type_the_text_as_on_text_wall(String arg1) throws Throwable {
		System.out.println("Text wall is " + arg1);
	}

	@When("^I click on post button$")
	public void i_click_on_post_button() throws Throwable {
	    System.out.println("^I click on post button");
	}

	@Then("^I should be see the Message on my wall$")
	public void i_should_be_see_the_Message_on_my_wall() throws Throwable {
		System.out.println("I should be see the Message on my wall$");
	}

	@When("^I supply youtube link as \"([^\"]*)\"$")
	public void i_supply_youtube_link_as(@Transform(TransformData.class)String arg1) throws Throwable {
		System.out.println(" value is " + arg1);
	   
	}

	@Then("^I should be see video on the my wall$")
	public void i_should_be_see_video_on_the_my_wall() throws Throwable {
		System.out.println("I should be see video on the my wall$");
	   	}

	@Then("^I should have see proper thumbil$")
	public void i_should_have_see_proper_thumbil() throws Throwable {
		System.out.println("I should be see video on the my wall$");

	}

	

}
