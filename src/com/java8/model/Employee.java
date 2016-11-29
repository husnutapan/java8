package com.java8.model;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	private int id;
	private String name;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.getSalary() > o2.getSalary())
			return 1;
		else if (o1.getSalary() < o2.getSalary())
			return -1;
		else
			return 0;
	}

}
