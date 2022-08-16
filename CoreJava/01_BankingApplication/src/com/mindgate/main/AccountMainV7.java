package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.AccountFactory;
import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.Savings;

public class AccountMainV7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		
		System.out.println("Press 1 for Savings");
		System.out.println("Press 2 for Current");
		
		System.out.println("Enter your choice");
		
		choice = scanner.nextInt();
		AccountFactory accountFactory = new AccountFactory();
		Account account = accountFactory.getAccount(choice);
		
		if(account instanceof Savings)
			System.out.println("Savings Object created");
		if(account instanceof Current)
			System.out.println("Current Object created");
		
		System.out.println("Account Object Created");
	}
}
