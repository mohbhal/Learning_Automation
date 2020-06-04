package com.java.oopspartone;

public class TestInter implements My {

	public static void main(String[] args) {
		
		My m=new TestInter();
		m.show();
	}

	@Override
	public void show() {
		System.out.println(" overridden");
		
	}
	

}
