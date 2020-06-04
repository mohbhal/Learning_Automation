package com.qa.testngOne;

import org.testng.annotations.Test;

public class LoginTest {
	
	
	@Test(groups = {"Titletest","LoginPageTest"})
	public void getTitle() {
		
		System.out.println("title1");
	}
	@Test(groups = {"Gettest","LoginPageTest"})

	public void getLogo() {
		//String text=driver.findElement(By.name("btnK")).getText();
		System.out.println("text");
	}
	
   }
