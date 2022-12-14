package com.mindgate.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository implements EmployeeRepositoryInterface {
	
	private String driverName = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "system";
	private String password = "mindgate123";
	private List<Employee> employeeList;
	
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	private static final String INSERT_EMPLOYEE ="insert into employee_details values(?,?,?)"; //
	private static final String SELECT_ALL_EMPLOYEES = "select * from employee_details";
	private static final String DELETE_EMPLOYEE = "DELETE FROM EMPLOYEE_DETAILS where employee_Id = ?";
	private static final String UPDATE_EMPLOYEE= "Update employee_details set NAME= ? where (EMPLOYEE_ID=?)";
	// getOne is pending
	
	@Override
	public boolean addNewEmployee(Employee employee) {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
			preparedStatement =connection.prepareStatement(INSERT_EMPLOYEE);
			preparedStatement.setInt(1, employee.getemployee_Id());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setDouble(3, employee.getSalary());
			
			int insertCount = preparedStatement.executeUpdate();
			
			if(insertCount>0) {
				return true;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return false;
	}


	@Override
	public List<Employee> getAllEmployees() {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
			
			preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEES);
			resultSet=preparedStatement.executeQuery();
			
			employeeList = new ArrayList<>();
			while (resultSet.next()) {
				int employeeId  = resultSet.getInt("Employee_Id");
				String name = resultSet.getString("name");
				double salary = resultSet.getDouble("salary");
				
				Employee employee = new Employee(employeeId, name, salary);
				employeeList.add(employee);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return employeeList;
	}


	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
			preparedStatement =connection.prepareStatement(DELETE_EMPLOYEE);
			preparedStatement.setInt(1, employeeId);
			
			int insertCount = preparedStatement.executeUpdate();
			
			if(insertCount>0) {
				return true;
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public boolean updateEmployee(String name, int employeeId) {
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
			preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);
			
			preparedStatement.setString(1, name);
			preparedStatement.setInt(2, employeeId);
			
			
			int insertCount = preparedStatement.executeUpdate();

			if (insertCount > 0) {
				return true;

			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}


}
