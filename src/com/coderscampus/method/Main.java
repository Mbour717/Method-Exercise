package com.coderscampus.method;

public class Main {

	public static void main(String[] args) {
		Scan getUser = new Scan();
		
		// Testing Phase
		getUser.userInput();
		
		if (getUser.userInput() >= 50 || getUser.userInput() <= 300) {
			System.out.println("The number you typed in was: ");
		}
		else {
			System.out.println("the number you typed in was: null");
		}
		
		System.out.println(getUser);
	}

}
