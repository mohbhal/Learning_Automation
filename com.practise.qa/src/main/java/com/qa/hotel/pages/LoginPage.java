package com.qa.hotel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hotel.testBase.TestBase;



public class LoginPage extends TestBase {

	// Page Factory--
	@FindBy(tagName = "img")
	WebElement imglogo;
	
	@FindBy(linkText = "REGISTER")
	WebElement registerlink;
	
	@FindBy(xpath  = "//img[@alt='Find a Flight']//preceding::td[2]/font/b")
	WebElement date;

	@FindBy(name = "userName")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(name = "login")
	WebElement loginbutton;

	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	public RegisterPage clickOnRegister() {
		System.out.println(registerlink.getText());
		registerlink.click();
		return new RegisterPage();
	}
   
	public String verifyLoginPageTitle() {

		return driver.getTitle();
	}
   
	public boolean validateLogo() {
		
		return imglogo.isDisplayed();
	   
	}
    
	public String getTheDate() {
		
		return date.getText();
		
	}

	public FlightFinderPage loginToPage(String un, String pwd) {

		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		return new FlightFinderPage();
	}


}
