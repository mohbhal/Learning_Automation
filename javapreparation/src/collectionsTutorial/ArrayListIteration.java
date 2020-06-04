package collectionsTutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		ArrayList<String> tvseries=new ArrayList<String>();
		
		tvseries.add("Game of thrones");
		tvseries.add("Breakink add");
		tvseries.add("The Big bang");
		tvseries.add("The walkingdead");
		tvseries.add("prison Break");
		
		//1. Using java 8 with for each loop and lambda expression.
		System.out.println("********Using java 8 with for each loop and lambda expression.\r\n" + 
				"************");
		tvseries.forEach(shows -> {
			System.out.println(shows);
		});
		tvseries.stream().forEach(System.out::println);
		
		System.out.println("********using iterator************");
		
		//2. using iterator
		Iterator< String> it=tvseries.iterator();
		
		while(it.hasNext()) 
		{
		String shows=it.next();
		System.out.println(shows);
				
	}
		

		//3. Using iterator and java 8 forEachremaining() method
		  System.out.println("**********Using iterator and java 8 forEachremaining() method*****");
		  it=tvseries.iterator();
		  it.forEachRemaining(show -> { System.out.println(show);});
		  
		  //4. using for each loop
		  System.out.println("********using for each loop************");
		  
		  for(String show:tvseries) {
			  System.out.println(show);
		  }
		  
		  //5. Using for loop with order/index:
		  System.out.println("********Using for loop with order/index:*******");
		   for(int i=0;i <tvseries.size();i++) {
			   System.out.println(tvseries.get(i));
		   }
		   
		   //6. using list iterator to traverse in both the direction
		    System.out.println("****using list iterator to traverse in both the direction*******");
		   ListIterator<String>  li=tvseries.listIterator(tvseries.size());
		   while(li.hasPrevious()) {
			   String show=li.previous();
			   System.out.println(show);
		   }
		   
		   
		  
		
		

}
}
