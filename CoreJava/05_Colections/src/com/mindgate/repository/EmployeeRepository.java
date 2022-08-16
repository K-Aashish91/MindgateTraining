package com.mindgate.repository;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository {
	private List<Employee> empList = new ArrayList<>();

	public boolean addEmployee(Employee employee) {
		// boolean result = empList.add(employee);
		return empList.add(employee);
	}

	public List<Employee> getAll() {

		return empList;
	}

	// getone
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee e : empList) {

			if (e.getEmployeeId() == employeeId) {
				return e;
			}
		}

		return null;

	}

	// delete
	public boolean DeleteEmployeeByEmployeeById(int employeeId) {
		for (Employee e : empList) {
			if (e.getEmployeeId() == employeeId) {
				boolean result = empList.remove(e);
				return result;
			}

		}

		return false;
	}

	public boolean updateEmployee(Employee e) {
		for (Employee e1 : empList) {
			if (e1.getEmployeeId() == e.getEmployeeId()) {

				e1.setName(e.getName());
				e1.setSalary(e.getSalary());

				return true;
			}
		}
		return false;
	}
}
