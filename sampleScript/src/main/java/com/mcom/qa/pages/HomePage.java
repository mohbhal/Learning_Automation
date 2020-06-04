package com.mcom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mcom.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//img[@alt='Marriott Logo']")
	WebElement imagelogo;	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyHomePageTitle() {
		String title=driver.getTitle();
		return title;
}
}
