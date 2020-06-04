package com.mohit.java8;

public class LambdaUnderHood {

	public static void main(String[] args) {
//		MyFunctionalInterface fun=new MyFunctionalInterface() {
//			
//			@Override
//			public void myMethod() {
//			  System.out.println("Implementation 1");				
//			}
//		};
//		MyFunctionalInterface fun1=new MyFunctionalInterface() {
//			
//			@Override
//			public void myMethod() {
//			  System.out.println("Implementation 2");				
//			}
//		};
		MyFunctionalInterface fun=()-> System.out.println(" I am LightWeight");
		fun.myMethod();

	}

}
