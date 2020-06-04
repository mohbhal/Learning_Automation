package com.javaExample.qa;

import java.util.Scanner;

public class IfElseCondition1 {
	public static void main(String[] args) { 
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a number");
	int num = scn.nextInt();
	if(num<50) {
		System.out.println("fail");
	}
	else if(num>=50 && num<=60 ) {
		
		System.out.println("Pass");
	}
	else if(num>60 && num<=75) {
		System.out.println("Ist");
	}

}
}