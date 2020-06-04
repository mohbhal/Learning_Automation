package com.javaExample.qa;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateForSprint {
	public static void main(String[] args) {

		
		SimpleDateFormat newDate = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		 String startDate = newDate.format(date);
		System.out.println(" current date is :" +startDate);
		
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -11);
        
		//Date eleven = cal.getTime();
		 
		String eleven=newDate.format(cal.getTime());
		System.out.println(" From cuurent to 11 days back date : "  +eleven);
		Calendar cal1 = Calendar.getInstance();
		cal1.add(Calendar.DAY_OF_YEAR,-7);
		/*Date previous = cal.getTime();
		System.out.println(previous);*/
		//cal.add(Calendar.DAY_OF_MONTH,-7);
		//Date seven = cal.getTime();
		String seven=newDate.format(cal1.getTime());
		System.out.println(" From cuurent to 1 year and 7 days back date : "  +seven);

	}

}
