package polyexamples;

public class Child extends Parent {

	public void show() {

		System.out.println(" Child  Class method override from Parent");
	}

	public void showChildMethod() {

		System.out.println(" Child Class personal method");
	}

	public static void main(String[] args) {
		System.out.println("**** Child class object & child class reference");
		
		Child c1 = new Child();
		c1.show();
		c1.showChildMethod();
		c1.showParentMethod();
		System.out.println("");
		
		System.out.println("**** Child class object & Parent class reference");
		
		Parent p1=new Child();//Upcasting
		p1.show();
		p1.showParentMethod();
		//p1.showChildMethod(); ----> Can not access child class personal method
		System.out.println("");
		
		System.out.println("**** Parent class object & Parent class reference");
		
		Parent p2=new Parent();
		p2.show();
		p2.showParentMethod();
		//p2.showChildMethod();-------> Can not access child class personal method
		System.out.println("");
		
		System.out.println("**** Parent class object & Child class reference");
		
		Child c2=(Child) p1;//Downcasting ---->assigning reference id of child class object from parent refrence variable to child reference variable
		
		c2.show();
		c2.showChildMethod();
		c2.showParentMethod();
		

	}

}
