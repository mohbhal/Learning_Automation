package com.qa.appium;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FirstTest extends BaseAppium {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> Adriver=capabilities();
		Adriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		System.out.println("Before Click");
		Adriver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		System.out.println("After Click");
		Adriver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		Adriver.findElementById("android:id/checkbox").click();
		Adriver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
       Adriver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
       Adriver.findElementById("android:id/button1").click();
       Adriver.findElementsByClassName("android.widget.Button").get(2).click();
       
	}

}
