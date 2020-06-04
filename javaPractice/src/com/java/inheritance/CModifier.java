package com.java.inheritance;

public class CModifier extends BModifier {
	void methodOfClassC()
    {
        System.out.println(j);     //Default member can be inherited within package
        System.out.println(k);    //protected member can be inherited to any subclass
        System.out.println(m);    //public member can be inherited to any subclass
 
        
    }

	public static void main(String[] args) {
		BModifier b = new BModifier();
        System.out.println(b.j);   //Default member can be used within package
        System.out.println(b.k);   //Protected member can be used anywhere in the package
        System.out.println(b.m);  //Public member can be used anywhere

	}

}
