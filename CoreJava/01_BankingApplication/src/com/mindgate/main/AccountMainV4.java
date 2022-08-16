package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountMainV4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		double amount;
		int choice;
		String continueChoice;
		boolean result;
		boolean isSalary;

		System.out.println("In Main3");

		System.out.println("Enter the Account number");
		accountNumber = scanner.nextInt();
//		System.out.println(accountNumber);
		scanner.nextLine();

		System.out.println("Enter the name");
		name = scanner.nextLine();
//		System.out.println(name);

		System.out.println("Enter the balance");
		balance = scanner.nextDouble();
//		System.out.println(balance);

		System.out.println("Do you want to open salary account (true|false)");
		isSalary = scanner.nextBoolean();
		
		
		Savings account3 = new Savings(accountNumber, name, balance, isSalary);

		System.out.println(account3);

		do {

			System.out.println("Menu");
			System.out.println("1) Withdraw");
			System.out.println("2) Deposit");
			System.out.println("3) Balance");

			System.out.println("Enter Your choice");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the amount to withdraw");
				amount = scanner.nextDouble();
				result = account3.withdraw(amount);
				if (result)
					if (result)
						System.out.println("Transaction Success!");
					else
						System.out.println("Transaction Failed");

				System.out.println("Balance :: " + account3.getBalance());

				break;

			case 2:
				System.out.println("Enter the amount to deposit");
				amount = scanner.nextDouble();
				result = account3.deposit(amount);
				if (result)
					if (result)
						System.out.println("Transaction Success!");
					else
						System.out.println("Transaction Failed");

				System.out.println("Balance :: " + account3.getBalance());

				break;

			case 3:
				System.out.println("Balance :: " + account3.getBalance());
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

			System.out.println("Do you want to continue");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));

	}

}
