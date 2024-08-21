package com.leetcode.binarysearch;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	int id;
	int age;
	double salary;
	String name;

	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public Employee(int id, int age, double salary, String name) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.name = name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static void main(String[] args) {
		
		Employee emp1=new Employee(1,26,10000.0,"Ram");
		Employee emp2=new Employee(1,26,20000.0,"Girish");
		Employee emp3=new Employee(1,26,80000.0,"Amit");
		Employee emp4=new Employee(1,26,500000.0,"Viraj");
	
		List<Employee> employeelist=new ArrayList<>();
		
		employeelist.add(emp1);
		employeelist.add(emp2);
		employeelist.add(emp3);
		employeelist.add(emp4);
		
		List<Employee> employeelist2	=employeelist.stream().sorted((e1,e2)->e2.getName().compareTo(e1.getName())).
		sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).
		collect(Collectors.toList());

		
		
		System.out.println(employeelist2);
		
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}

}
