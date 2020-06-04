package hooks;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class GeneralHooks {
	public static String accessKey = "TqLf9HDdJGufDEzv261r";
	public static String userName = "mohitbhal1";
	public static AndroidDriver<AndroidElement> driver;
	public static IOSDriver<IOSElement> iosdriver;
	
	@Before("@Android")
	public void setUpAndroid() throws MalformedURLException {
		File fpath = new File("C:\\Users\\mohbhal\\eclipse-workspace\\AppiumOnIAndroidEcommerceApp\\src\\main\\java\\appDetails\\General-Store.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "TestingEmu");
		cap.setCapability(MobileCapabilityType.APP, fpath.getAbsolutePath());
		
		
			 driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			
		
	}
	@Before("@Ios")
	public void setUpIos() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("device", "iPhone 11 Pro");
		caps.setCapability("os_version", "13");
		caps.setCapability("project", "My First Project");
		caps.setCapability("build", "My First Build");
		caps.setCapability("name", "Bstack-[Java] Sample Test");
		caps.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");

		 iosdriver = new IOSDriver<IOSElement>(
				new URL("http://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);
	}
	
	public static AndroidDriver<AndroidElement>  getDriverAnd() {
		return driver;
	}
	public static IOSDriver<IOSElement> getDriverIos(){
		
		return iosdriver;
	}

}
