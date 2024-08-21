package com.leetcode.backtracking.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
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

	public static void main(String[] args) {

		Employee e1= new Employee(1, "Java", 10000);
		Employee e2= new Employee(3, "spring", 20000);
		Employee e3= new Employee(4, "hibernate", 40000);
		Employee e4= new Employee(2, "micrioservice", 60000);
		
		List<Employee> list=new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list);
		
	
		System.out.println(list);
		
	}

	@Override
	public int compareTo(Employee o) {

		return this.id - o.id;
	}

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}
