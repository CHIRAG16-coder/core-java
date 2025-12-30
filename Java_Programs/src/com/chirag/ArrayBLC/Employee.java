package com.chirag.ArrayBLC;

public class Employee
{
	private int id ;
	private String name ;
	private double marks;
	
	public Employee(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
