package com.nit.BLCELC;

public class EmployeeNew 
{
	private int id ;
	private String name;
	private double salary;
	
	
	public void setEmployeeDetails(int id, String name, double salary)
	{
		this.id = id ;
		this.name = name;
		this.salary = salary;
	}
	
	public void calculateSalaryIncrement()
	{
		double inc = 0;
		if(this.salary < 50000)
		{ 
			inc = salary*0.10;
		}
		else if (this.salary >= 50000 && this.salary <=80000)
		{
			inc = salary*0.07;
		}
		else 
		{
			inc = salary*0.05;
		}
		salary = salary + inc ;
		System.out.println("Salary Increment Amount: "+inc);
		System.out.println("Updated Salary: "+salary);
	}

	@Override
	public String toString() {
		return "EmployeeNew [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

	
	
	
	
}
