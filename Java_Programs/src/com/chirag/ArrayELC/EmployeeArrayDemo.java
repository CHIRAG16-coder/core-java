package com.chirag.ArrayELC;

import java.util.Scanner;

import com.chirag.ArrayBLC.Employee;



public class EmployeeArrayDemo {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees: ");
		int size = Integer.parseInt(sc.nextLine());
		
		Employee[] arr = new Employee[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter deatils for Employee "+(i+1)+":");
			System.out.println("Enter ID: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter Name: ");
			String name = sc.nextLine();
			System.out.println("Enter Salary: ");
			double salary = Double.parseDouble(sc.nextLine());
			arr[i]= new Employee(id,name,salary);
		}
		
		System.out.println("===== Employee Details =====");
		for(Employee emp:arr)
		{
			System.out.println(emp);
		}
	}

}
