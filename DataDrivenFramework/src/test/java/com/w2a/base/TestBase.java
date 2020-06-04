package com.w2a.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.w2a.utilities.ExcelReader;

public class TestBase 
{
	/*
	 * WebDriver 
	 * Properties 
	 * Logs 
	 * ExtentReports 
	 * DB 
	 * Excel 
	 * Mail
	 */
	public static WebDriver driver;
	public static Properties config=new Properties();
	public static Properties OR=new Properties();
	FileInputStream fisConfig;
	FileInputStream fisOR;
	public static Logger logger=Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel=new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\excel\\testData.xlsx");
	public static WebDriverWait wait;
	
	
	
	@BeforeSuite
    public void setUp() 
    {
    	if(driver==null)
    	{
    		 try 
    		 {
				fisConfig=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\config.properties");
				fisOR=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");

			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
    		try {
				config.load(fisConfig);
				logger.debug("Config file is loaded");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
    		try {
				OR.load(fisOR);
				logger.debug("OR file is loaded");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
    	}
    	if(config.getProperty("browser").equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver",
    				"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
    		driver = new ChromeDriver();
    		logger.debug("Chrome is launched");
    	}
    	driver.get(config.getProperty("testsiteurl"));
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
    	wait=new WebDriverWait(driver, 5);
 }
    public boolean isElementPresent(By by)
    {
    	try {
    	driver.findElement(by);
    	return true;
    	}
    	catch(NoSuchElementException e) {
    		return false;
    	}
    }
    
    @AfterSuite
    public void tearDown() 
    {
    	if(driver!=null) {
    	driver.quit();
    	}
    }
}
