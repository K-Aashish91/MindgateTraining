package com.mindgate.main;

import com.mindgate.pojo.Calculation;

public class ExceptionMain {
	public static void main(String[] args) {
		
		System.out.println("Main Starts !");
		
		Calculation obj = new Calculation();
		
		obj.accept();
		obj.calculate();
		obj.display();
		
		System.out.println("Main Ends :");
	}

}
