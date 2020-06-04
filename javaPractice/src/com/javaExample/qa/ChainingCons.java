package com.javaExample.qa;

public class ChainingCons {
	public ChainingCons() {
		this(10);
		System.out.println("default");
	}
	ChainingCons(int x){
		this(3,4);
		System.out.println(" value of x is :"+x);
	}
	ChainingCons(int x,int y){
		
		System.out.println(x*y);
	}

	public static void main(String[] args) {
	new ChainingCons();

	}

}
