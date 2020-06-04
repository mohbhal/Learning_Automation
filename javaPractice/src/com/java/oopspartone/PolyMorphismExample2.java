package com.java.oopspartone;

public class PolyMorphismExample2 {

	int x=10;
	void get(PolyMorphismExample2 this,int y) {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		PolyMorphismExample2 po = new PolyMorphismExample2();
        System.out.println(po);
        po.get(30);
	}
}
