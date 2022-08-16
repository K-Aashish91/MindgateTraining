package com.mindgate.pojo;

public class Employee {
	private int employee_Id;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employee_Id, String name, double salary) {
		super();
		this.employee_Id = employee_Id;
		this.name = name;
		this.salary = salary;
	}

	public int getemployee_Id() {
		return employee_Id;
	}

	public void setemployee_Id(int employee_Id) {
		this.employee_Id = employee_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employee_Id=" + employee_Id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}


