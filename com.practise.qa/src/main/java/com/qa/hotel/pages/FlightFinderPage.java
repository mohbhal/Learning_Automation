package com.qa.hotel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hotel.testBase.TestBase;

public class FlightFinderPage extends TestBase {
	
	@FindBy(linkText = "SIGN-OFF")
	WebElement signofflink;
	
	
	public FlightFinderPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyFlightFindPage() {
		
		return driver.getTitle();
	}
	
	

}
