package com.javaExample.qa;
interface Speed{
	void run();
}

public class StaticKeyword {

public static void getSpeed() {
	System.out.println("Speed is 40");
}
public static void main(String[] args) {
	Speed speed=StaticKeyword::getSpeed;
	speed.run();
}

}
