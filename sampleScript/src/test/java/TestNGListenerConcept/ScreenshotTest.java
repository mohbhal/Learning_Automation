package TestNGListenerConcept;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {
	
	@BeforeMethod
	public void setup() {
		initialization();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	@Test(testName = "test ka naam")
	
	public void takeScreenshot() {
		System.out.println("Test is failed");
		Assert.assertEquals(true, false);
	}
   @Test
	
	public void takeScreenshot1() {
	   System.out.println("Test is failed12333");
		Assert.assertEquals(true, false);
	}

   @Test

   public void takeScreenshot2() {
	   System.out.println("Test is failedeerrttt");
	Assert.assertEquals(true, false);
   }

}
