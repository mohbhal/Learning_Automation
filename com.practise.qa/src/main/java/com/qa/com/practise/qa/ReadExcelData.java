package com.qa.com.practise.qa;

public class ReadExcelData {

	public static void main(String[] args) {
		ReadData rd=new ReadData("C:\\Users\\mohbhal\\eclipse-workspace\\Page URL input.xlsx");
		System.out.println(rd.getData(0,0,0));
		
	}

}
