import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalenderByJs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/default.aspx");
		WebElement date=driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		String dateValue="30-12-2020";
		selectDteByJs(driver, date, dateValue);
		System.out.println("date is selected");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_txt_Fromdate']+button.ui-datepicker-trigger")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']/preceding::div[1]")).click();
		String dateAfter=driver.findElement(By.id("view_fulldate_id_1")).getText();
		System.out.println(dateAfter);
		//driver.quit();
		
		
	}
	public static void selectDteByJs(WebDriver driver,WebElement element, String dateVal) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
		
	}

}
