package appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseAppium {
	
	public static String accessKey = "TqLf9HDdJGufDEzv261r";
	public static String userName = "mohitbhal1";
	public static AndroidDriver<AndroidElement> capabilities() throws Exception  {
		//File fsrc = new File("src");
		File fpath = new File("C:\\Users\\mohbhal\\eclipse-workspace\\AppiumWithCucumber\\src\\main\\java\\app\\ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestingEmu");
		cap.setCapability(MobileCapabilityType.APP, fpath.getAbsolutePath());
		
		
			AndroidDriver<AndroidElement> Adriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
		
		
			return Adriver;
		
	}
	public static IOSDriver<IOSElement> iosCapibilities() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("device", "iPhone 11 Pro");
		caps.setCapability("os_version", "13");
		caps.setCapability("project", "My First Project");
		caps.setCapability("build", "My First Build");
		caps.setCapability("name", "Bstack-[Java] Sample Test");
		caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");

		IOSDriver<IOSElement> iosdriver = new IOSDriver<IOSElement>(
				new URL("http://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
		return iosdriver;

		
		
	}
	
	

}
