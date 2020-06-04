package com.java.inheritance;

public class B extends A {
//	
//	B()
//	{
//		System.out.println(" Child Constructor Block");
//	}
	
	public static void get() {
		System.out.println(" Static method");
	}

	public static void main(String[] args) {
		B b=new B();
		b.get();

	}

}
