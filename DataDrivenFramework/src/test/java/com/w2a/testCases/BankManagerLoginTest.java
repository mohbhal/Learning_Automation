package com.w2a.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {
	@Test
	public void loginAsBankManager() throws InterruptedException {

		logger.debug("Inside login test");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector(OR.getProperty("bmlBtn"))).click();
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))), "Login not successful");
		logger.debug("test is got passed");
		driver.findElement(By.cssSelector(OR.getProperty("addCustBtn_CSS"))).click();

	}

}
