package com.mohit.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortTheMapInJava8 {

	public static void main(String[] args) {
		Map<Integer,String> unsortMap = new HashMap<Integer,String>();
        
        //Insert Id-Name pairs into idNameMap
         
		unsortMap.put(10, "z");
        unsortMap.put(5, "b");
        unsortMap.put(6, "a");
        unsortMap.put(20, "c");
        unsortMap.put(1, "d");
        unsortMap.put(7, "e");
        unsortMap.put(8, "y");
        unsortMap.put(99, "n");
        unsortMap.put(50, "j");
        unsortMap.put(2, "m");
        unsortMap.put(9, "f"); 
        
        
        LinkedHashMap<Integer, String> sorted=unsortMap.entrySet()
                 .stream()
                 .sorted(Entry.comparingByValue())
                 .collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->	e1,LinkedHashMap::new));
        
        System.out.println("Before Sorting : ");
        
        System.out.println(unsortMap);
         
        System.out.println("After Sorting : ");
         
        System.out.println(sorted);
        
        
        
}
	
}
