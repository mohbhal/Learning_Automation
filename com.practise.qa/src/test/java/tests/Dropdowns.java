package tests;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement dropdownButton = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		dropdownButton.click();
		Select dropdownValue = new Select(driver.findElement(By.xpath(" //select[@id='ctl00_mainContent_ddl_Adult']")));
		dropdownValue.selectByValue("2");
		driver.findElement(By.id(" "));
		int i=1;
		while(i<5) {
			driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
			i++;
		}
		driver.close();

	}

}
