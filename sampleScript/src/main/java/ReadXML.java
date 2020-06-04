import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadXML {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		List<String> words = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\mohbhal\\OneDrive - Publicis Groupe\\Desktop\\test.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
			words.add(line);
			System.out.println(line);
		}
		for (int i = 0; i < words.size(); i++) {

			driver.get(words.get(i));

		}

		// String url=driver.getCurrentUrl();
		String value;
		int i = 0;
		if (words.get(i).contains(".txt")) {
			WebElement ele = driver.findElement(By.xpath("//pre[contains(text(),'User-agent')]"));
			value = ele.getText();
		} else {
			Thread.sleep(12);
			WebElement ele1 = driver
					.findElement(By.xpath("(//*[text()='http://www.sitemaps.org/schemas/sitemap/0.9'])[1]"));
			value = ele1.getText();
		}

		System.out.println(value);
	}
}
