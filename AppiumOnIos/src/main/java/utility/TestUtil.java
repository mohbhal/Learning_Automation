package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestUtil {
	public static Properties prop;
	public void getprop() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(
					"C:\\Users\\mohbhal\\eclipse-workspace\\AppiumOnIos\\src\\main\\java\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
