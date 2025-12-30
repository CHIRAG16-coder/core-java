package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.EmployeeNew;

public class EmployeeDemo1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		EmployeeNew e = new EmployeeNew();
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Employee ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Employee Salary: ");
		double sal = Double.parseDouble(sc.nextLine());
		
		System.out.println("");
		e.setEmployeeDetails(id, name, sal);
		
		
		System.out.println("----- Employee Information -----");
		System.out.println("Employee Details:");
		System.out.println(e);
		System.out.println("");
		
		System.out.println("----- Salary Increment Details -----");
		e.calculateSalaryIncrement();
		sc.close();
		
		
		
		
		
	}

}
