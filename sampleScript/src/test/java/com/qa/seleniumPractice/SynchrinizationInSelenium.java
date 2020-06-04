package com.qa.seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchrinizationInSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

	}

}
