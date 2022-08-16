package com.mindgate.main;

import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;

public class EmployeeRepositiryMain {
	 public static void main(String[] args) {
		EmployeeRepository er1 =  new EmployeeRepository();
		Employee e1 = new Employee(101, "AK", 100);
		Employee e2 = new Employee(102, "AK2", 100);
		Employee e3 = new Employee(103, "AK", 100);
		Employee e4 = new Employee(104, "AK2", 100);
		er1.addEmployee(e1);// Employee class object is transferred to EmployeeRepository class
		er1.addEmployee(e2);
		er1.addEmployee(e3);
		er1.addEmployee(e4);
		
		//getone
		List<Employee> eList = er1.getAll();
		
		
		for(Employee e : eList) {
			System.out.println(e);
		}
		
		System.out.println();
		Employee e = er1.getEmployeeByEmployeeId(102); // give input as employeeId (do not input index number)
		System.out.println(e);
		
		//delete
		System.out.println();
		System.out.println("Before Delete: ");
		eList =er1.getAll();
		for(Employee eb : eList) {
			System.out.println(eb);
		}
		
		
		System.out.println();
		boolean res = er1.DeleteEmployeeByEmployeeById(102);
		System.out.println("After Delete: ");
		eList =er1.getAll();
		for(Employee ea : eList) {
			System.out.println(ea);
		}
		
		//Update
		Employee updateEmployee = new Employee(103, "AK123", 1000);
		
		System.out.println();
		System.out.println("Before Update: ");
		eList =er1.getAll();
		for(Employee eb : eList) {
			System.out.println(eb);
		}
		
		er1.updateEmployee(updateEmployee);
		
		System.out.println();
		System.out.println("After Update: ");
		eList =er1.getAll();
		for(Employee eb : eList) {
			System.out.println(eb);
		}
		
		//HashSet --> Hashing algorithm
		
	}
}
