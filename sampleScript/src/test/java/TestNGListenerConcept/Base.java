package TestNGListenerConcept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public  static void initialization() {
		System.setProperty("webdriver.chrome.driver",
				"src\\test\\java\\com\\marriotqa\\sampleScript\\chromedriver.exe");

		 driver = new ChromeDriver();
		 driver.get("https://www.google.com");
		
	}
    public void failed(String testmethodname) 
    {
      File src=( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      try {
		FileUtils.copyFile(src, new File("C:\\Users\\mohbhal\\eclipse-workspace"
				+ "\\sampleScript\\screenshots\\"+testmethodname+"_"+".png"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
    	
    }
}
