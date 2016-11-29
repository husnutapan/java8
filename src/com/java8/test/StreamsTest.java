package com.java8.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.java8.model.Employee;

public class StreamsTest {

	public static void main(String a[]) {
		List<Employee> employees = Arrays.asList(new Employee(1, "Husnu", 5000), new Employee(2, "Enes", 6000),
				new Employee(3, "Mehmet", 7000), new Employee(4, "Hakan", 5600));

		// Filter with start Alphabet char with sortable
		employees.stream().filter(s -> s.getName().startsWith("H")).map(s -> s.getName().toUpperCase()).sorted()
				.forEach(new Consumer<String>() {
					@Override
					public void accept(String t) {
						System.out.println(t);
					}
				});

		// Get salary greater than 6000
		List<Integer> greaterSalary = employees.stream().map(Employee::getSalary).filter(salary -> salary > 6000)
				.collect(Collectors.toList());

		greaterSalary.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}

		});

	}

}
