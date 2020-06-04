package com.qa.com.practise.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","emailid"})
	public void loginSiteTest(String url,String emailid) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(emailid);
		driver.findElement(By.name("signin")).click();
		System.out.println("click next");
		
	}

}
