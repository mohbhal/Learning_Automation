package collectionsTutorial;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//dynamic in nature
		//can contain duplicate elements
		//synchronization
		//allow random access to fetch
		
		ArrayList ar=new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(20);
		System.out.println(ar.size());
		
		ar.add(110);
		ar.add(210);
		ar.add(130);
		ar.add(null);
		ar.add(null);
		ar.add(null);
		ar.add("Mohit");
		ar.add('a');
		ar.add(true);
		System.out.println(ar.size());//size of array
		System.out.println(ar.get(8));//get the value from index
		
		//to print all values
		//1. For loop
		//2. Iterator
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		//non generics and generics
		ArrayList<Integer> arg=new ArrayList<Integer>();
		arg.add(1100);
		arg.add(2100);
		arg.add(1300);
	ar.addAll(arg);
	for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
	}
	
		
		
		
		
	}

}
