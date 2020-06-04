package com.qa.hotel.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.hotel.pages.SignOnPage;
import com.qa.hotel.pages.RegisterPage;
import com.qa.hotel.testBase.TestBase;
import com.qa.hotel.util.TestUtil;

public class RegisterPageTest extends TestBase {

	RegisterPage registerpage;
	SignOnPage homepage;
	 
	public  RegisterPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		homepage = new SignOnPage();
		registerpage = new RegisterPage();
		System.out.println("Register Page stuff'''''  " + registerpage.toString() );
		System.out.println("Driver Stuff'''''" + driver.toString());

	}

	/*
	 * @Test public void titleVerify() { // registerpage.getTitle();
	 * 
	 * }
	 */
   @DataProvider
   public Object[][] getTestData() {
	  
	Object data[][]=TestUtil.getTestData("contacts");
	   return data;
	   
   }
	@Test(dataProvider = "getTestData")
	public void registerFormSubmit(String firstname,String lastname,String email,String password,String confirmpassword) {

		
		  homepage.clickOnRegister();
		  registerpage.registration(firstname, lastname, email, password, confirmpassword);
		 
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
