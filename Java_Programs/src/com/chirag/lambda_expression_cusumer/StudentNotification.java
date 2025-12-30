package com.chirag.lambda_expression_cusumer;

import java.util.function.Consumer;

record Student(Integer id, String name, String course) {}

public class StudentNotification
{
	public static void main(String[] args) 
	{
		int input = Integer.parseInt(IO.readln("Enter number of students: "));
		
		Consumer<Student> notification = student -> 
		{
		IO.println("Hello "+student.name()+"! Welcome to the "+student.course()+" course.");
		};
		
		for(int i = 0; i<input;i++)
		{
			IO.println("\nEnter details for Student "+(i+1)+":");
		    Integer id = Integer.parseInt(IO.readln("Enter ID: "));
		    String name = IO.readln("Enter Name: ");
		    String course = IO.readln("Enter Course: ");
		    Student student = new Student(id, name, course);
		    notification.accept(student);   
		}
	}
}
