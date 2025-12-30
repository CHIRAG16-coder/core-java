package com.nit.BLCELC;

public class Employee
{
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData(int id, String name, double salary) 
	{
		 employeeId = id ;
		 employeeName = name ;
		 employeeSalary = salary;
	}
	
	public void getEmployeeData()
	{
		System.out.println("---------Employee Info---------");
		System.out.println("Employee Id    : "+employeeId);
		System.out.println("Employee Name  : "+employeeName);
		System.out.println("Employee Price : "+employeeSalary);
	}
}
