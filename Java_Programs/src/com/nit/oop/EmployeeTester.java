package com.nit.oop;

import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args) 
	{
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the Employee Last Name:");
		String last = sc.nextLine();
		
		System.out.println("Enter the Employee ID :");
		int id  = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Employee Salary:");
		double salary = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter the Employee No of Project:");
		int proj  = Integer.parseInt(sc.nextLine());
		
		System.out.println();
		
		e.setEmployeeData(name, last, id, salary, proj);
		
		
		System.out.println("----------------------EMPLOYEE INFO--------------------");
		System.out.println("Employee Full Name          : "+name+" "+last);
		System.out.println("Employee ID                 : "+id);
		System.out.println("Employee Salary Before Bonus: ₹ "+salary);
		System.out.println("Employee No Of Project Done : "+proj);
		e.calculateSalary();
		System.out.println("Employee Salary After Bonus : ₹ "+e.salary);
		sc.close();
		

}
}
