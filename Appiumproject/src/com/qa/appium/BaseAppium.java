package com.qa.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseAppium {
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		//File fsrc = new File("src");
		File fpath = new File("C:\\Users\\mohbhal\\eclipse-workspace\\Appiumproject\\src\\com\\qa\\appium\\ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestEmulator");
		cap.setCapability(MobileCapabilityType.APP, fpath.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;
	}

}
