package exapmples;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups= {"Functional", "regression"})
	public void method1() {
		System.out.println("Method 1");
	}
	@Test(groups= { "regression"})
	public void method2() {
		System.out.println("Method 2");
	}
	@Test(groups= {"Functional"})
	public void method3() {
		System.out.println("Method 3");
	}

}
