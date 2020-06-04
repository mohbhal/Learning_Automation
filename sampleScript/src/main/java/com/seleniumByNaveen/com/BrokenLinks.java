package com.seleniumByNaveen.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		allLinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println(allLinks.size());
		
		
//		for (WebElement webElement : allLinks) {
//			System.out.println(webElement.getText());
//			
//		}
		 allLinks.forEach(str1->System.out.println(str1.getText()));

	}

}
