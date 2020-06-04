package com.mcom.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mcom.qa.base.TestBase;
import com.mcom.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	HomePage homepage;
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		new HomePage();
	}
	@Test
	public void verifyTitle() {
		System.out.println(homepage.verifyHomePageTitle());
		
	}
	@AfterMethod
	public void tearDown() {	
		driver.close();
	}

}
