package com.mohit.java8;

import java.util.ArrayList;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");	
		
		names.stream()
		     .filter(name->name.length()>7)
		     .forEach(System.out::println);
		
		names.stream()
	     .filter(name->name.contains("Bru"))
	     .forEach(System.out::println);
		     

	}

}
