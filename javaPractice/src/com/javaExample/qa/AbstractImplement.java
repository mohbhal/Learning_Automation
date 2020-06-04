package com.javaExample.qa;

public class AbstractImplement extends AbstractClasss {
	public static void getCollege() {
		System.out.println(" College");
	}
	public void getCompany() {
		System.out.println(" Compnay");
	}

	public static void main(String[] args) {
		AbstractClasss abs=new AbstractImplement();
        abs.getCompany();
        abs.getname();
        getNumber();
	}

}
