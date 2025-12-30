package com.chirag.ArrayELC;

import java.util.Scanner;

import com.chirag.ArrayBLC.Student;

public class StudentArrayDemo 
{
	public static void main (String[]args)
	{
		Student []arr = new Student[3];
		
		arr[0]=new Student(101,"Ravi",89.5);
		arr[1]=new Student(102,"Anita",92.0);
		arr[2]=new Student(101,"Kiran",85.75);
		for(Student student:arr)
		{
			System.out.println(student);
		}
	}
	
	
}
