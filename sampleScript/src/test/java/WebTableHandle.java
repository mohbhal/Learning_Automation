import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
	
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		
		//*[@id="customers"]/tbody/tr[3]/td[1]
		
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"src\\test\\java\\com\\marriotqa\\sampleScript\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	
	String beforexpath="//*[@id=\"customers\"]/tbody/tr[";
	String afterxpath="]/td[1]";
	for(int i=2;i<=7;i++) {
		String actualxpath=beforexpath+i+afterxpath;
		WebElement element=driver.findElement(By.xpath(actualxpath));
		System.out.println(element.getText());
	}

	}

}
