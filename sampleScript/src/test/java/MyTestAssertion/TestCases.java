package MyTestAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class TestCases {
	
	SoftAssert soft=new SoftAssert();
	
	
	@Test
	public void test1() {
		
		System.out.println("Open browser");
		
		Assert.assertEquals(true, true);
		
		System.out.println("Enter Usernamer");
		System.out.println("Enter password");
		System.out.println("click on button");
		Assert.assertEquals(true, false);
		System.out.println("Validate home page");
		//Assert.assertEquals(true, false);
		//soft.assertEquals(true, false);
		
		System.out.println("Go to 1 page");
		System.out.println("Go to 2 page");
		soft.assertEquals(true, false);
		System.out.println("Go to 3page");
		
		//soft.assertAll();
	}
	@Test
	public void test2() {
		
		System.out.println("Open browser 22222222");
		

}
}
