package com.java8.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

import com.java8.model.Employee;

public class ForeachTest {

	public static void main(String[] args) {
		List<Employee> employees = new LinkedList<Employee>();
		Employee employee = new Employee(1, "Employee 1", 5000);
		Employee employee2 = new Employee(1, "Employee 2", 6000);
		Employee employee3 = new Employee(1, "Employee 3", 4000);

		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);

		// With Iterator...
		System.out.println("--Iterator--");
		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee emp = (Employee) iterator.next();
			System.out.println(emp.getName());
		}

		// with foreach...

		System.out.println("---Foreach---");
		employees.forEach(new Consumer<Employee>() {
			@Override
			public void accept(Employee t) {
				System.out.println(t.getName());
			}
		});
	}

}
