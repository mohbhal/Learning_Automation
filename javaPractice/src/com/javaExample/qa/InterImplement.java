package com.javaExample.qa;

public class InterImplement implements InterExample {
  int i=50;
	public static void main(String[] args) {

		InterImplement in = new InterImplement();
		in.getColor();
		in.getSpeed();
		in.getDriverName();
		InterExample.getBrand();
		System.out.println(InterExample.getPrice(100.45));
		System.out.println(InterExample.i);
		System.out.println(in.i);
	}

	@Override
	public void getSpeed() {
		System.out.println("Speed");

	}

	@Override
	public void getColor() {
		System.out.println(" color");

	}

}
