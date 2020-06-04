package collectionsTutorial;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h1=new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "peter");
		h1.put(3, "java");
		
		System.out.println(h1.hashCode());
		
		Hashtable h2=new Hashtable();
		//h2=(Hashtable) h1.clone();
		h2.put(1, "Tom");
		System.out.println(h2);
		
		System.out.println(h2.hashCode());
		System.out.println("The values are from h1 " +h1);
		System.out.println("The values are from h2 " +h2);
		
		h1.clear();
		System.out.println("The values are from h1 " +h1);
		System.out.println("The values are from h2 " +h2);
		
//		Hashtable ht=new Hashtable();
//		ht.put("A", "Mohit");
//		ht.put("B", "Bhal");
//		ht.put("C", "Testing");
//		
//		if(ht.contains("Bhal"))
//			System.out.println("Value is found");
//		
//		//print all the values from using Enumeration -- elements()
//		Enumeration en=ht.elements();
//		
//		System.out.println("**************");
//		while(en.hasMoreElements()) {
//			
//			System.out.println(en.nextElement());
//		}
//	Set se=ht.entrySet();
//		
//			
//		System.out.println(se);
//		
	}

}
