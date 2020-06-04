package com.javaExample.qa;

public class ThisKey {
   void m() {
	   System.out.println("M");
   }
   void n() {
	   //this.m();
	   System.out.println(" N");
   }
	public static void main(String[] args) {
		ThisKey t=new ThisKey();
		t.n();

	}

}
