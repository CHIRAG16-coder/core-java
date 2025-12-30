package com.nit.oop;

public class Employee
{	
		String firstName;
		String lastName;
		int employeeId;
		double salary;
		int noOfProject;
	
	public void setEmployeeData(String name,String last,int id ,double sal,int proj)
	{
		firstName = name;
		lastName  = last;
		employeeId= id;
		salary    = sal;
		noOfProject=proj;
	}
	
	public void calculateSalary()
	{   
	double	bonus;
		
		bonus = switch(noOfProject)
		{
		case 0,1,2,3,4 ->
		{
			yield 0;
		}
		case 5,6,7,8,9 ->
		{
			  yield 5000;
		}
		case 10,11,12,13,14,15,16,17,18,19 ->
		{
			yield 10000;
		}
		default ->
		{
			yield 15000;
		}
		};
		salary+=bonus;
	}	
}
