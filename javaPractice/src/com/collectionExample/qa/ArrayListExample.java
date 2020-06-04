package com.collectionExample.qa;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("1");
		al.add("1");
		al.add("1");
		al.add("1");
		
		Iterator<String> itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
