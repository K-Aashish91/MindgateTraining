package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;

public class AccountMainV3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int accountNumber;
		String name;
		double balance;
		double amount;
		int choice;
		String continueChoice;
		boolean result;
		
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

		Account account3 = new Account(accountNumber, name, balance);

		System.out.println(account3);
		
		do
		{

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
			if(result)
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
			if(result)
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
		} while(continueChoice.equals("yes"));
	
//		if (choice == 1) {
//
//			if (account3.withdraw(100))
//				System.out.println("Transaction Success!");
//			else
//				System.out.println("Transaction Failed");
//
//			System.out.println("Balance :: " + account3.getBalance());
//
//		}
//
//		if (choice == 2) {
//
//			if (account3.deposit(100))
//				System.out.println("Transaction Success!");
//			else
//				System.out.println("Transaction Failed");
//
//			System.out.println("Balance :: " + account3.getBalance());
//
//		}
//		if (choice == 3) {
//
//			System.out.println("Balance :: " + account3.getBalance());
//
//		}
//		
//		System.out.println("Do you want to continue");
//		String cont;
//		cont = scanner.next();
//		
//		if(cont == ) {
//			
//		}
		
	}

}
