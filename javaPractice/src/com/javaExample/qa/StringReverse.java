package com.javaExample.qa;

public class StringReverse {

	public static void main(String[] args) {
		reverseStr(" java is an language");

	}

	private static void reverseStr(String s) {
		String str[] = s.split(" ");

		String rev = " ";

		for (int i = str.length - 1; i >= 0; i--) {
			rev = str[i];
			System.out.print(rev);
			System.out.print(" ");
		}

	}

}
