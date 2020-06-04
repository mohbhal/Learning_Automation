package collectionsTutorial;

import java.util.HashMap;
import java.util.Map.Entry;



public class HashMapConcept {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Selenium");
//		hm.put(2, "QTP");
//		hm.put(3, "JMeter");
//		hm.put(4, "Scraming");
//		hm.put(1, "Selenium");
//		hm.put(5, "Selenium");
		hm.put(1, "ABCD");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		
		for(Entry m :hm.entrySet()) {
			System.out.println(m.getKey() + " "+ m.getValue());
		}
		hm.remove(3);
		System.out.println(hm);
		HashMap<Integer, Employee>  emp=new HashMap<Integer, Employee>();
		Employee e1=new Employee("Tom", 25, "Dev");
		Employee e2=new Employee("Pet", 32, "QA");
		Employee e3=new Employee("Mohit", 35, "Testing");
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		for(Entry<Integer, Employee> x:emp.entrySet()) {
			int key=x.getKey();
			Employee e=x.getValue();
			System.out.print("Employee " + key + " info: ");
			System.out.println(e.name +" " +e.age +" "+e.dept);
		}
		

	}

}
