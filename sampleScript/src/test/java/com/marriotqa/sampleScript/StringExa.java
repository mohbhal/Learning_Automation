package com.marriotqa.sampleScript;

public class StringExa {

	public static void main(String[] args) {
		String s1="//*[contains(@href,'')]";
		System.out.println(s1);
		String s2="/hotelwebsites/us/n/nycmq/nycmq_pdf/Crossroads_Lunch.pdf"; 
		System.out.println(s2);
		String s3="//*[contains(@href,'"+s2+"')]";
		System.out.println(s3);
				
	}

}
