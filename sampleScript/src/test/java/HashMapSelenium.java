
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapSelenium {

	public static void main(String[] args) {
		// role based --- permission based use case
		// category manager user -- go to app -- add all the products.
		//1. customer user -- buy a product --- place an order
		//2. Admin user -- can see all the orders
		//3. seller users --- go to the app -- see only those orders which are relevant
		//4. Distribution user -- go to the app -- can see the respective order
		//5. delivery boy user -- go to app -- can see the order and deliver the product
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("mohit");
		driver.findElement(By.name("pass")).sendKeys("test@123");
		driver.findElement(By.id("u_0_b")).click();
		System.out.println(getCredentialsMap());
		System.out.println(getCredentialsMap().get("deliveryboy"));
	}
	public static HashMap<String, String> getCredentialsMap() {
		HashMap<String, String> userMap=new HashMap<String, String>();
		userMap.put("Customer", "mohit:test@123");
		userMap.put("admin", "mohit:test@1234");
		userMap.put("distributer", "mohit:test@1234");
		userMap.put("seller", "mohit:test@1235");
		userMap.put("deliveryboy", "mohit:test@1237");
		
		return userMap;
		
		
		
		
		
	}

}
