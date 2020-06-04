package collectionsTutorial;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee 
{
	
	String name;
	int age;
	String dept;
	
	public Employee(String name,int age,String dept) 
	{

		this.name=name;
		this.age=age;
		this.dept=dept;
		
	}
	
	public static void main(String[] args) {
		
		
		Employee e1=new Employee("Mohit", 32, "QA");
		Employee e2=new Employee("Deepika", 32, "Coder");
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		
		Iterator<Employee> it=al.iterator();
		while(it.hasNext()) {
			Employee ae=it.next();
			System.out.println(ae.name);
			System.out.println(ae.age);
			System.out.println(ae.dept);
			
	  for(Employee h:al) {
		  System.out.println(h.name);
		  System.out.println(h.age);
		  System.out.println(h.dept);
	  }
	}

	}
}
	
	
	
