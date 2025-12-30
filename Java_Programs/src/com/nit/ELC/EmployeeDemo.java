package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.Employee;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner sc = new Scanner (System.in);
		//System.out.println("---------Employee Info---------");
		
		System.out.println("Enter the Employee ID : ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Employee Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Employee Salary : ");
		double salary = Double.parseDouble(sc.nextLine());
		
		//calling the function form the BLC class 
		e.setEmployeeData(id, name, salary);
		e.getEmployeeData();
		sc.close();

	}

}
