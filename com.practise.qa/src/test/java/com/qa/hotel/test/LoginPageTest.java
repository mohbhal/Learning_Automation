package com.qa.hotel.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.hotel.pages.LoginPage;
import com.qa.hotel.testBase.TestBase;


import junit.framework.Assert;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;

	public LoginPageTest() {
		// to invoke constructor of testBase class to initialize property file.
		super();
		
	}

	@BeforeMethod
	public void setup() {
		initialization();
		
		loginpage = new LoginPage();
		
	}
    
	@Test(priority = 1,description = "verifying login title")
	
	public void loginPageTitleTest() {
		
		
		String title = loginpage.verifyLoginPageTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
	}
	@Test(priority = 2,description = "verifying login logo")
	

	
	public void logoImageTest() {
		boolean flag = loginpage.validateLogo();
		Assert.assertTrue(flag);
	}
	@Test(priority = 2,description = "verifying login date")
	
	public void dateValidation() {
		String expected=loginpage.getTheDate();
		System.out.println("App date is ..."+expected);
	}

	@Test(priority = 3)
	public void loginTest() {
		
		 loginpage.loginToPage(prop.getProperty("username"), prop.getProperty("password"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
