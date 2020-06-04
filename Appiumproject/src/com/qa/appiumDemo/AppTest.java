package com.qa.appiumDemo;



import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppTest {

	public static AppiumDriver driver;
	  
	  public static void main(String[] args) throws MalformedURLException
	  {
		  System.out.println("Program started : " );	  
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("deviceName", "Galaxy Nexus1");
		  capabilities.setCapability("platformVersion", "10");
		  capabilities.setCapability("platformName", "Android");
		   capabilities.setCapability("appPackage", "com.android.chrome");
    	   capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
    	   driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    	   System.out.println("connected to google chrome  " );	  

	  }
	  
}
