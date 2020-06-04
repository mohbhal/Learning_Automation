package com.mohit.java8;

import java.util.Arrays;
import java.util.List;

public class StreamsWithMap {

	public static void main(String[] args) {
		List<PojoCustomer> customerList=Arrays.asList(
	    		   new PojoCustomer("Tom",30),
	    		   new PojoCustomer("Peter",40),
	    		   new PojoCustomer("Mohit",32),
	    		   new PojoCustomer("Sam",44)
	    		   );
		String name=customerList.stream()
		            .filter(ele->"Peter".equals(ele.getName()))
		            .map(PojoCustomer::getName)
		            .findAny()
		            .orElse(null);
		System.out.println(name);
	}

}
