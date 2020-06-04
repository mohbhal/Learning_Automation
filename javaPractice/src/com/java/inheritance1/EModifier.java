package com.java.inheritance1;

public class EModifier extends DModifier {
	
	void methodOfClassE()
    {
        System.out.println(k);     //Protected member can be inherited to any subclass
        System.out.println(m);     //public member is always inherited
 
        DModifier d = new DModifier();
        //System.out.println(d.k);     Protected member can not be used outside the package.
        System.out.println(d.m);    //public member can be used anywhere
    }

}
