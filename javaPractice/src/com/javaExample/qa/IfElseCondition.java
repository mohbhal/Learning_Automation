package com.javaExample.qa;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scn.nextInt();
		if (num % 2 == 0) {
			System.out.println("Num is even");
		} else {
			System.out.println("num is odd");
		}

	}

}
