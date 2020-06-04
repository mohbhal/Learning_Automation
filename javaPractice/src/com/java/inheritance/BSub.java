package com.java.inheritance;

public class BSub extends ASuper {
	BSub()
    {
        super(10);
        //Calling statement to super class constructor
    }
 
    void methodOfSubClass()
    {
        System.out.println(super.i);  //super class field is accessed
        
        System.out.println("From method of sub class");
    }
    public void methodOfSuperClass() {
    	super.methodOfSuperClass();
    	System.out.println("Override from super class");
    	
    }

	public static void main(String[] args) {
		BSub b=new BSub();
		b.methodOfSubClass();
		b.methodOfSuperClass();
		

	}

}
