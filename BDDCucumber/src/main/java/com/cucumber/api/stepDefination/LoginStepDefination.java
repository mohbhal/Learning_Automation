package com.cucumber.api.stepDefination;


import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
  
public class LoginStepDefination {
	
//	 WebDriver driver;
//	
//	
//	@Given("^user is on login page$")
//	public void user_already_login_page() {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("http://newtours.demoaut.com/");
//	
//	}
	
	@Given("^User is on login page of the application$")
	public void user_is_on_login_page_of_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User login with following username and password$")
	public void user_login_with_following_username_and_password(DataTable table) throws Throwable {
		List<List<String>> data=table.raw();
		for(List<String> str:data) 
		
		{
			for(String str1:str) 
			{
				System.out.println("Data is " +str1);
				
			}
		}
		
	    
	}
	@Then("^User is able to login successfully$")
	public void user_is_able_to_login_successfully() throws Throwable {
	   
	   
	}
	


	
}
