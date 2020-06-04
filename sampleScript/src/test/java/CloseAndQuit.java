import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class CloseAndQuit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"src\\test\\java\\com\\marriotqa\\sampleScript\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		SessionId sessionid = ((RemoteWebDriver) driver).getSessionId();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		System.out.println(sessionid);
		
	driver.quit();
		 sessionid = ((RemoteWebDriver) driver).getSessionId();
		System.out.println(sessionid);
		
		System.out.println(driver.getTitle());
	}

}
