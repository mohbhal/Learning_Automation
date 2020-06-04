package com.javaExample.qa;

public class SubSuperClass extends SuperKey {
	public SubSuperClass() {
	super();
	
	System.out.println(" sub class");
	}
	public SubSuperClass(int i) {
		this();
		System.out.println(i);
	}

	public static void main(String[] args) {
		SuperKey sup=new SubSuperClass(10);
		
			}

}
