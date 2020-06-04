package com.threadExample.qa;

public class ThreadExample extends Thread {
	public void run() {

		try {
			System.out.println("thread " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		int n = 8;

		for (int i = 1; i <= n; i++) {
			ThreadExample obj = new ThreadExample();
			obj.start();
		}

	}

}
