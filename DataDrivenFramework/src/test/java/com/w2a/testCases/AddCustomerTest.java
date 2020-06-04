package com.w2a.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class AddCustomerTest extends TestBase {
	@Test(dataProvider = "getData")
	public void addCustomer(String firstName, String lastName, String postalCode, String alertText)
			throws InterruptedException {
		logger.debug("Inside add customer test");
		driver.findElement(By.cssSelector(OR.getProperty("addCustBtn_CSS"))).click();
		driver.findElement(By.cssSelector(OR.getProperty("firstname_CSS"))).sendKeys(firstName);
		driver.findElement(By.xpath(OR.getProperty("lastname_XPATH"))).sendKeys(lastName);
		driver.findElement(By.cssSelector(OR.getProperty("postcode_CSS"))).sendKeys(postalCode);
		driver.findElement(By.cssSelector(OR.getProperty("addbtn_CSS"))).click();

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(alertText));
		logger.debug("Alert is present");
		alert.accept();
		logger.debug("Alert is accepetd");
		Thread.sleep(3000);
	}

	@DataProvider
	public Object[][] getData() {
		String sheetName = "AddCustomerTest";
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		Object[][] data = new Object[rows - 1][cols];

		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				System.out.println("Row - " + rowNum + "Column - " + colNum);

				data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);

			}
		}

		return data;
	}

}
