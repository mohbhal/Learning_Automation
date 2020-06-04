package com.javaExample.qa;

public interface InterExample {
	
	int i=100;
	public void getSpeed();
	
	public void getColor();
	
	public static void getBrand() {
		System.out.println(" Audi Brand ");
		
	}
	public default void getDriverName() {
		System.out.println(" Jason sthathon");
	}
	public static double getPrice(double d) {
		double price=d+100;
		return price;
	}
	static void newMethod() {
		System.out.println(" static method");
	}

	
}
