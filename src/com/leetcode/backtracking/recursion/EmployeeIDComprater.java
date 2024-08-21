package com.leetcode.backtracking.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeIDComprater implements Comparator<EmployeeIDComprater> {

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

		EmployeeIDComprater e1= new EmployeeIDComprater(1, "Java", 10000);
		EmployeeIDComprater e2= new EmployeeIDComprater(3, "spring", 20000);
		EmployeeIDComprater e3= new EmployeeIDComprater(4, "hibernate", 40000);
		EmployeeIDComprater e4= new EmployeeIDComprater(2, "micrioservice", 60000);
		
		List<EmployeeIDComprater> list=new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list,new EmployeeIDComprater(0, null, 0));
		
	
		System.out.println(list);
		
	}

	

	public EmployeeIDComprater(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compare(EmployeeIDComprater o1, EmployeeIDComprater o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
}
