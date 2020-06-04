package com.java.oopspartone;

public class PolyMorphismExample {
	
public static void main(String[] args) {
	
////  Child c1=new Child();
////  c1.start();
////  c1.brandName();
////  System.out.println("**********");
////  
////  Parent p1=new Parent();
////  p1.start();
////  p1.wheels();
////  p1.stop();
////  System.out.println("**********");
//  Child p2=new Child();
//  p2.start();
//  p2.stop();
//  p2.wheels();
//  p2.brandName();
//  
//  System.out.println("**********");
// Child c2= (Child) p2;
// c2.brandName();
// c2.start();
// c2.stop();
// c2.wheels();
	Child c1=new Child();
	c1.startParent();
	
	System.out.println("***************");
	
	Parent p=new Parent();
	p.startParent();
	System.out.println("***************");

	p= (Parent)p;
	p.startParent();
	System.out.println("***************");

	p=(Child)p;
	p.startParent();
 
	
}
}
