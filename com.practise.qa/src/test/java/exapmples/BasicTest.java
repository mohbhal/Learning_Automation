package exapmples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BasicTest {
	@Test(dataProvider="DemoData")
	public void getData(String s) {
		System.out.println(" Normal method");
	}
	@Test(dataProvider="DemoData1")
	public void getData(String s,int i) {
		System.out.println("overload method");
	}
	@DataProvider(name="DemoData1")
	public static Object[][] dataProviderMethod()
	{
		return new Object[][] {{"Mohit",123}};
	}
	
	
	@DataProvider(name="DemoData")
	public static Object[][] dataProviderMethod1()
	{
		return new Object[][] {{"Mohit"}};
	}
}