package com.w2a.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.w2a.base.TestBase;

public class TestUtil extends TestBase {
	public static void failed(String testmethodname) 
    {
      File src=( (TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      try {
		FileUtils.copyFile(src, new File("C:\\Users\\mohbhal\\eclipse-workspace"
				+ "\\DataDrivenFramework\\target\\screenshots\\"+testmethodname+"_"+".png"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
    	
    }

}
