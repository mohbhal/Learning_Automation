package com.qa.com.practise.qa;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataExcel {
	
    String xptah="//*[contains(@href,'pdf')]";
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

			File src = new File("C:\\Users\\mohbhal\\eclipse-workspace\\Page URL input.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheetAt(0);
			int rowNum=sh.getLastRowNum();
			System.out.println("total rows are " + rowNum);
			for(int i=0;i<=rowNum;i++) {
				 String data=sh.getRow(i).getCell(1).getStringCellValue();
				 System.out.println("Url values "  +data);
				 
			}
		  
		
		}  

		 catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
}



