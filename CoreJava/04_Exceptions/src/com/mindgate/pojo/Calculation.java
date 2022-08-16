package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
	private int num1;
	private int num2;
	private int result;

	public void accept() {
		Scanner scanner = new Scanner(System.in);
		try {
			
			System.out.println("Enter num1 : ");
			num1 = scanner.nextInt();
			System.out.println("Enter num2 : ");
			num2 = scanner.nextInt();
		}

		catch (InputMismatchException e) {
			System.out.println("Invalid Input");
		}

		finally {
			System.out.println("Thank you!");
			scanner.close();
		}
	}

	public void calculate() {
		System.out.println("In calculate ");

		result = num1 + num2;
	}

	public void display() {
		System.out.println("Result is : " + result);
	}
}
