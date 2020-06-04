package com.qa.hotel.test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hotel.pages.SignOnPage;

import com.qa.hotel.testBase.TestBase;

public class SignOnTest extends TestBase {
	
	SignOnPage signonpage;
	
	public SignOnTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		signonpage = new SignOnPage();
		
	}
	
	
	@Test
	public void loginOnHomePage() {
		String tiltleOfSignOn=signonpage.verifyLoginPageTitle();
		Assert.assertEquals(tiltleOfSignOn, "Welcome: Mercury Tours");
		signonpage.loginToPage(prop.getProperty("username"), prop.getProperty("password"));
		
		
		
	}
	
	

	@AfterMethod
	public void teardown() {
		driver.quit();
	}


}
