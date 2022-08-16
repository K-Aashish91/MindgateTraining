package com.mindgate.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.mindgate.pojo.Employee;

public class CollectionsMain {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList<>();
		System.out.println(nameList.size());
		nameList.add("Anjali");
		nameList.add("Anjali1");
		nameList.add("Anjali2");
		nameList.add("Anjali3");
		nameList.add("Anjali4");
		nameList.add("Anjali3");
		System.out.println(nameList);
		System.out.println(nameList.size());
		nameList.remove(2);
		System.out.println("After remove");
		System.out.println(nameList);
		System.out.println(nameList.size());
		
		System.out.println();
		List<Employee> employeeList = new ArrayList<>();
		
		
		Employee employee1 = new Employee(101, "Kavita1", 1000);
		Employee employee2 = new Employee(102, "Kavita2", 1000);
		Employee employee3 = new Employee(103, "Kavita3", 1000);
		
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
		for(Employee e : employeeList) {
			System.out.println(e);
			
		}
		
		System.out.println();
		System.out.println(employeeList);
		
		System.out.println();
		Set<String> nameSet	= new HashSet<>();
		nameSet.add("Yash1");
		nameSet.add("Yash2");
		nameSet.add("Yash1"); // no duplicates will be printed
		nameSet.add("Yash4");
		nameSet.add("Yash5");
		nameSet.add(null); // no order followed 
		
		System.out.println(nameSet);
		
		System.out.println();
		SortedSet<String> sortedNameSet = new TreeSet<>();
		sortedNameSet.add("Yash1");
		sortedNameSet.add("Yash2");
		sortedNameSet.add("Yash3"); 
		sortedNameSet.add("Yash4");
		sortedNameSet.add("Yash5");
		sortedNameSet.add("Yash1");// no duplicates will be printed
		//sortedNameSet.add(null); // no null allowed
		
		
		System.out.println(sortedNameSet); //in sorte (Ascending value)
		
		System.out.println(); 
		HashMap<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(101,"Vivek");
		employeeMap.put(102,"Vivek1");
		employeeMap.put(103,"Vivek2");
		employeeMap.put(104,"Vivek3");
		
		System.out.println(employeeMap);
		
		Integer i =50;
		System.out.println(i.hashCode());
		
		System.out.println();
		SortedMap<Integer, String> employeeSortedMap = new TreeMap<>();
		employeeSortedMap.put(1, "Test1");
		employeeSortedMap.put(10, "Test10");
		employeeSortedMap.put(5, "Test5");
		employeeSortedMap.put(6, "Test6");
		
		System.out.println(employeeSortedMap); // sorting according to key
		
	}
}
