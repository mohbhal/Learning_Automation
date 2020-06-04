package com.mohit.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapStream {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("ONE", 1);
		map.put("one", 1);
		map.put("ONE", 7);
		map.put("one", 2);
		map.put("TWO", 2);
		map.put("THREE", 3);
		map.put("FOUR", 4);
		map.put("FIVE", 5);
		map.put("FOUR", 6);
		map.put("Six", 6);
//		map.put(null, null);
//		map.put("null3", null);
//		map.put("null34", null);


		map.put("FIVE", 5);
		Map<String,Integer> result=map.entrySet()
		   .stream()
		   .filter(maps->maps.getValue().intValue()>=1)
		   .collect(Collectors.toMap(maps -> maps.getKey(), maps-> maps.getValue()));
		   System.out.println("Result: " + result);
	}

}
