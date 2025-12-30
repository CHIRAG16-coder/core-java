package com.chirag.method_overriding;

import java.util.Scanner;

public class Employee 
{
	protected int id ;
	protected String name;
	
	public Employee(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	public double calculateSalary()
	{
		System.out.println("Generic Salary");
		return 0.0;
	}	
}

class FullTimeEmployee extends Employee
{
	protected double salary;
 
	public FullTimeEmployee(int id, String name, double salary) 
	{
		super(id, name);
		if(salary<0)
		{
			System.out.println("Salary can't be negative!!!");
			System.exit(0);
		}
		this.salary = salary;
	}
	
	@Override
	public double calculateSalary()
	{
		return salary;
		
	}
	
}

class PartTimeEmployee extends Employee
{
	protected double hourlyRate;
	protected int hoursWorked;
	
	public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) 
	{
		super(id, name);
		this.hourlyRate = hourlyRate;
		if(hourlyRate<0)
		{
			System.out.println("Employee hourly rate can't be zero OR Negative");
			System.exit(0);
		}
		this.hoursWorked = hoursWorked;
		if(hoursWorked<0)
		{
			System.out.println("Employee hours of work can't be Negative");
			System.exit(0);
		}
	} 
	
	@Override
	public double calculateSalary()
	{
		return hourlyRate*hoursWorked;
		
	}	
}


 class EmployeeSalary 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("***Salary Calculation Menu***		\r\n"
				+ "		 1) FullTime Employees \r\n"
				+ "		 2) PartTime Employees ");
		
		System.out.println("Please select the Employee type");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) 
		{
		   case 1 ->
		    {
		    	System.out.print("Enter Fulltime Employee Id :");
		    	int id = Integer.parseInt(sc.nextLine());
		    	
		    	System.out.print("Enter Fulltime Employee Name :");
		    	String name = sc.nextLine();
		    	
		    	System.out.print("Enter the Salary :");
		    	double salary = Double.parseDouble(sc.nextLine());
		    	
		    	Employee emp = new FullTimeEmployee(id, name, salary);
		    	double totalsalary = emp.calculateSalary();
		    	System.out.println(name+" Salary is :"+totalsalary);
		    }
		   case 2 ->
		   {
			    System.out.print("Enter PartTime Employee Id :");
		    	int id = Integer.parseInt(sc.nextLine());
		    	
		    	System.out.print("Enter PartTime Employee Name :");
		    	String name = sc.nextLine();
		    	
		    	System.out.print("Enter your hourly rate:");
		    	int hour= Integer.parseInt(sc.nextLine());
		    	
		    	System.out.print("Enter your total works hour in the month :");
		    	int month = Integer.parseInt(sc.nextLine());
		    	
		    	Employee emp= new PartTimeEmployee(id, name, hour, month);
		    	double totalsalary = emp.calculateSalary();
		    	System.out.println(name+" Salary is :"+totalsalary);
		    }
		}
	}
}
