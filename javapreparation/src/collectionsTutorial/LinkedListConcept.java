package collectionsTutorial;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<String>();
		
	//add
		ll.add("Test");
		ll.add("Test1");
		ll.add("Test1");
		ll.add("Test2");
		ll.add("Test3");
		
		System.out.println(" print the elements " + ll);
		
		ll.addFirst("new Ele");
		ll.addLast("last ele");
		

		System.out.println(" print the elements " + ll);
		
		//get
		System.out.println(ll.get(2));
		
		ll.set(2, "New Test2");
		System.out.println(ll.get(2));
		
		//iteration
		for(int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		System.out.println("*************");
		for(String ele:ll) {
			
			System.out.println(ele);
		}
		System.out.println("*************");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
