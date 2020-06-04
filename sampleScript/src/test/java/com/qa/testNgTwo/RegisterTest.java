package com.qa.testNgTwo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RegisterTest {
public static WebDriver driver;
@Test(groups = {"Titletest","LoginPageTest"})
public void getTitle() {
	
	System.out.println("title2");
}
@Test(groups = {"Gettest","LoginPageTest"})

public void getLogo() {
	//String text=driver.findElement(By.name("btnK")).getText();
	System.out.println("text");
}
}
