package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.Nit;

public class NitDemo {

	public static void main(String[] args)
	{
		Nit n = new Nit();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Student ID : ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Student Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Student Batch No : ");
		String batch = sc.nextLine();
		
		System.out.println("Enter the Student Fee : ");
		double salary = Double.parseDouble(sc.nextLine());
		
		n.setStudentInfo(id, name, batch, salary);
		n.getStudentData();
		sc.close();
	
	}

}
