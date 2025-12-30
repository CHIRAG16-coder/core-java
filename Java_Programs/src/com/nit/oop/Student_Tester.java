package com.nit.oop;

import java.util.Scanner;


public class Student_Tester
{
	public static void main(String[]args)
	{
	Student  s = new Student();
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Students id :");
	int sid = Integer.parseInt(sc.nextLine());
	
	System.out.println("Enter the Students name :");
	String sname= sc.nextLine();
	
	System.out.println("Enter the Students marks :");
	int smarks = Integer.parseInt(sc.nextLine());
	
	System.out.println("-------------STUDENTS INFO------------------");
	s.setStudentData(sid, sname, smarks);
	s.calculateGrade();
	s.displayDetails();
	sc.close();
	
	
	
	}
}
