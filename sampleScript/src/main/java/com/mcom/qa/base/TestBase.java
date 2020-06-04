package com.mcom.qa.base;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.mcom.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream(
					"C:\\Users\\mohbhal\\eclipse-workspace\\sampleScript\\src\\main\\java\\com\\mcom\\qa\\config\\config.properties");
			prop.load(file);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("browser");

		try {
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
				

				//Cookie name = new Cookie(prop.getProperty("cookieuser"), prop.getProperty("cookiepwd"));
				//driver.manage().addCookie(name);

			} else {
				System.out.println("browser is not found");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT_TIMEOUT, TimeUnit.SECONDS);
		
		String URL = "https://marriott:@kAmai@www.miram-uat01.marriott.com/service/access/setcookie/";
		driver.navigate().to(URL);
		driver.navigate().to("https://www.miram-uat01.marriott.com/default.mi");
	}

}
