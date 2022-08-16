package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCrudMain {
	public static void main(String[] args) {

		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		int employee_ID;
		String name;
		double salary;
		int choice;
		String continueChoice;
		List<Employee> allEmployees;

		do {

			System.out.println("1. Add New Employee ");
			System.out.println("2. Update Employee ");
			System.out.println("3. Delete Employee ");
			System.out.println("4. Select one Employee ");
			System.out.println("5. Select all Employee ");

			System.out.println("Please Select your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Please enter employeeId");
				employee_ID = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Please enter Name");
				name = scanner.nextLine();
				System.out.println("Please enter Salary");
				salary = scanner.nextDouble();

				Employee employee = new Employee(employee_ID, name, salary);

				boolean result = employeeServiceInterface.addNewEmployee(employee);

				if (result) {
					System.out.println("Insert Successful");

				} else {
					System.out.println("Insert Failed");
				}

				break;

			case 5:
				allEmployees = employeeServiceInterface.getAllEmployees();
				for (Employee e : allEmployees) {
					System.out.println(e);
				}

				break;
			case 2: {
				System.out.println("set name to");
				name = scanner.nextLine();
				scanner.nextLine();

				System.out.println("emp id");
				employee_ID = scanner.nextInt();
				scanner.nextLine();

				result = employeeServiceInterface.updateEmployee(name, employee_ID);

				if (result) {
					System.out.println("update succesfull");
				} else {
					System.out.println("update failed");
				}
				break;

			}
			case 3:
				System.out.println("Please enter employeeId");
				employee_ID = scanner.nextInt();
				
				result = employeeServiceInterface.deleteEmployeeByEmployeeId(employee_ID);

				if (result) {
					System.out.println("Delete Successful");

				} else {
					System.out.println("Delete Failed");
				}
				break;

			default:
				System.out.println("Invalid Choice");
				break;
			}

			System.out.println("Do you want to continue ");
			continueChoice = scanner.next();

		} while (continueChoice.equals("yes"));

	}
}
