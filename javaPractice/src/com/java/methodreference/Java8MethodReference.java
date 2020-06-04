package com.java.methodreference;

import java.util.function.Function;

public class Java8MethodReference {

	public static void main(String[] args) {
		
		Function<String, Integer> value=Integer::parseInt;
		System.out.println(value.apply("15"));
		
		
			}

}
