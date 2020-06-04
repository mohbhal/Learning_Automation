package com.mohit.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortTheMap {

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
        
        List<Entry<Integer, String>> listOfEntry = new LinkedList<>(unsortMap.entrySet());
        for(Entry<Integer,String> ent:listOfEntry) {
        	System.out.println(ent);
        }
        Collections.sort(listOfEntry, new Comparator<Entry<Integer,String>>()
        		{

					@Override
					public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) 
					{
						
						return o1.getKey().compareTo(o2.getKey());
					}
        	
        		
         
	});
        for(Entry<Integer,String> ent1:listOfEntry) {
        	System.out.println(ent1);
        }
        Map<Integer, String> sortedIdNameMap = new TreeMap<Integer,String>();
        
        for(Entry<Integer,String> entry:listOfEntry) {
        	sortedIdNameMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println("Before Sorting : ");
        
        System.out.println(unsortMap);
         
        System.out.println("After Sorting : ");
         
        System.out.println(sortedIdNameMap);   

}
	
}
