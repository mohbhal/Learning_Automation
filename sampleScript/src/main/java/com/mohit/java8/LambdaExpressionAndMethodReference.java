package com.mohit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionAndMethodReference {

	public static void main(String[] args) {
		
		//1. Annonymous Class
		List<String> names = Arrays.asList("Tom", "Peter", "Sam");
		names.forEach(new Consumer<String>() {

			public void accept(String t) {
				System.out.println(t);
				System.out.println(t);

			}

		});
		//2. Lambda Expression
		names.forEach(
				str->{
					System.out.println("I am light weight");
					System.out.println(str);
					}
			);
		
		//3.Method Expression
		names.forEach(System.out::println);
	}

}
