package com.javaExample.qa;

public class ThisKeyword {
	int i1;
   public ThisKeyword() {
	System.out.println("default");
}
   public ThisKeyword(int i) {
	   this();
	  
	   System.out.println(i);
   }
   
	public static void main(String[] args) {
		
    ThisKeyword t=new ThisKeyword(28);
	}

}
