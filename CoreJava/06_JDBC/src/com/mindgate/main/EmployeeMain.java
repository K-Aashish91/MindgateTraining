package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {
	
	

	
	public static void main(String[] args) {
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter employeeId");
		int employee_ID  = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter Name");
		String name  = scanner.nextLine();
		System.out.println("Please enter Salary");
		double salary  = scanner.nextDouble();
		
		
		
		
		Employee employee =  new Employee(employee_ID, name, salary);
		
		boolean result= employeeServiceInterface.addNewEmployee(employee);
		
		if(result) {
			System.out.println("Insert Successful");
			
		}
		else {
			System.out.println("Insert Failed");
		}
	}
}
