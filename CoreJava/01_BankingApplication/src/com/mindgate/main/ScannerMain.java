package com.mindgate.main;

import java.util.Scanner;

public class ScannerMain {
	public static void main(String[] args) {
		String name;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your name");
		
//		name = scanner.next();
		name = scanner.nextLine();
		
		System.out.println(name);
		
	
	}
}
