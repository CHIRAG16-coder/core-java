package com.chirag.arrays_basics_programming;

import java.util.Scanner;

class Employee
{
	int id;
	String name;
	double price;
	
	public Employee(int id, String name, double price) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + ", price=" + price + "]";
	}	
}
public class EmployeeArrayDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter number of employees: "));

		Employee[] emp = new Employee[size];
		
		for (int i = 0; i < emp.length; i++) 
		{
			IO.println("Enter details for Employee "+(i+1)+":");
			int id = Integer.parseInt(IO.readln("Enter ID: "));
			String name = IO.readln("Enter Name: ");
			double price = Double.parseDouble(IO.readln("Enter Salary: "));
			IO.println("");
			emp[i]= new Employee(id, name, price);
		}
		IO.println("===== Employee Details =====");
		for (Employee employee : emp) {
			IO.println(employee);
		}
		sc.close();
	}
}
