package com.coderscampus.method;

import java.util.Scanner;

public class Scan {
	
	int userInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number between 50 and 300");
		int input = scanner.nextInt();
		
		return input;	
		
	}
}
