package com.qa.hotel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.hotel.testBase.TestBase;

public class RegisterPage extends TestBase {

	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="confirmPassword")
	WebElement conconfirmpassword;
	
	@FindBy(name="register")
	WebElement registerbutton;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
		System.out.println("Driver Stuff in Register Page '''' "+driver.toString());
	}
	
public void registration(String fn,String ln, String eml,String pwd,String conpwd) {
		
		
		firstname.sendKeys(fn);
		lastname.sendKeys(ln);
		email.sendKeys(eml);
		password.sendKeys(pwd);
		conconfirmpassword.sendKeys(conpwd);
		registerbutton.click();
		
	}
public String getTitle() {
	String regTitle=driver.getTitle();
	return regTitle;
}
	
}
