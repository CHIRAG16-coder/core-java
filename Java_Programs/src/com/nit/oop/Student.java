package com.nit.oop;

public class Student
{
	int studentId;
	String studentName ;
	int studentMarks;
	char studentGrade ;
	public void setStudentData(int id ,String name ,int marks)
	{
		studentId = id ;
		studentName = name ;
		studentMarks = marks ;
	}
	
	public void calculateGrade()
	{
		if (studentMarks >= 90)
		{
			studentGrade='A';
		}
		else if (studentMarks >=81 && studentMarks <=91)
		{
			studentGrade='B';
		}
		else if (studentMarks >=71 && studentMarks <=80)
		{
			studentGrade='C';
		}
		else if (studentMarks >=61 && studentMarks <=70)
		{
			studentGrade='D';
		}
		else
		{
			studentGrade='E';
		}
	
	}
	
	public void displayDetails()
	{
		System.out.println("Student [Name="+studentName+", studentId="+studentId+", marks="+studentMarks+", grade="+studentGrade+"] ");
	}
}
