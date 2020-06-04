package com.udemy.testNG;

import org.testng.annotations.Test;

public class PriorityInTestNg {
	
	@Test
	public void webCarLogin() {
		System.out.println("Web Login car");
		
	}
	@Test
	public void mobileCarLogin() {
		System.out.println("Mobile Login car");
	}
	@Test
	public void loginApiCarLoan() {
		System.out.println("API Login car");
	}


}
