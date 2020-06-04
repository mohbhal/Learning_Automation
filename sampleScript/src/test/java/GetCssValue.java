import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"src\\test\\java\\com\\marriotqa\\sampleScript\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		String value=driver.findElement(By.id("gb_70")).getCssValue("font-size");
		
		
		System.out.println("value of css " + value);
		if (value.equals("13px")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
