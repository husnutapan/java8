package com.java8.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.java8.model.Employee;

public class SortTest {

	public static void main(String[] args) {
		List<Employee> employees = new LinkedList<Employee>();
		Employee employee = new Employee(1, "Employee 1", 5000);
		Employee employee2 = new Employee(1, "Employee 2", 6000);
		Employee employee3 = new Employee(1, "Employee 3", 4000);

		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		
		Collections.sort(employees, new Employee());

		
		
		for (int i = 0; i < employees.size(); i++) {
			System.out.println(employees.get(i).getName() + " " + employees.get(i).getSalary());
		}

	}

}
