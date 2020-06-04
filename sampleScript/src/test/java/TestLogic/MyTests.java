package TestLogic;

import org.testng.annotations.Test;

import junit.framework.Assert;


public class MyTests {
	
	@Test()
	public void test1() {
		System.out.println("Retry");
		Assert.assertEquals(false, true);
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}

}
