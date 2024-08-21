package com.coderscampus.method;

public class Main {

	public static void main(String[] args) {
		Scan getUser = new Scan();
		int zero = 0;
		
		System.out.println("Type a number between 50 and 300");
		getUser.userInput();
		
		if (zero >= 50 && zero <= 300) {
			System.out.println("The number you typed in was: " + getUser.userInput());
		}
		else {
			System.out.println("the number you typed in was: null");
		}
	}

}
