package com.qa.com.practise.qa;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{
	XSSFWorkbook wb;
	XSSFSheet sh;
	public ReadData(String filepath) 
	{
		try 
		{
			
			File src = new File(filepath);
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
			
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}
		public String getData (int sheetNum ,int rowNum ,int colNum) 
		{
			 sh = wb.getSheetAt(sheetNum);
			 String data=sh.getRow(rowNum).getCell(colNum).getStringCellValue();
			 int row=sh.getLastRowNum();
			 for(int i=0;i<row;i++) {
				 
			 }
			 return data; 
		}
	}
	


