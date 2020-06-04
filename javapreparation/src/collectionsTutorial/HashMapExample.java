package collectionsTutorial;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample 
{
	
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "JMeter");
		hm.put(4, "Scraming");
		hm.put(5, "SELENIUM");
		hm.put(6, "selenium");
		hm.put(null, null);
		hm.put(8, null);
		System.out.println(hm);
		
	Set<Entry<Integer, String>> set=hm.entrySet();
	Iterator<Entry<Integer, String>> it=set.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	boolean boo=hm.containsValue("Selenium");
	if(boo==true) {
		
		System.out.println("pass");
	}
		
	}

}
