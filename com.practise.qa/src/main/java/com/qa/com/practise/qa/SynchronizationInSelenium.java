package com.qa.com.practise.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationInSelenium 
{
    
	public static void main(String[] args) 
	{
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            //is always applied globally--available for all the elements
            
            driver.get("https://www.facebook.com/");
            WebElement firstname=driver.findElement(By.name("firstname"));
            WebElement lastname=driver.findElement(By.name("lastname"));
            sendKeys(driver, firstname, 10, "Tom");
            sendKeys(driver, firstname, 5, "Peter");

    }
	
	public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
}