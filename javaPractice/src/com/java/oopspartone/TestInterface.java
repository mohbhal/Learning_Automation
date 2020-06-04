package com.java.oopspartone;

public class TestInterface implements My1 {

	
	@Override
	public void show() {
		System.out.println(" Test Class");
		
	}
	public void childMethod() {
		System.out.println(" Normal method");
	}
	
	public static void main(String[] args) {
		
		 TestInterface t1=new TestInterface();
		 t1.show();
		 
		 System.out.println("***********");
		 
		 My1 m=new TestInterface();
		 m.show();
		 
		 System.out.println("***********");
		  MyRegister mr=new MyRegister();
		  mr.register(t1);
		

	}

	

}
