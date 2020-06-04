package com.java.oopspartone;

public class Emp {

	public static void main(String[] args) {
		int rowCount = 1;
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) 
			{

			}

			for (int j = 1; j <= rowCount; j++) 
			{
				System.out.print(j);
			}

			System.out.println();
			rowCount++;
		}
	}
}