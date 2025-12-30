package com.chirag.exception_try_catch_methods;

import java.util.InputMismatchException;

import java.util.Scanner;

public class SimpleExceptionDemo 
{
	void main()
	{
		//IO.println("Main Method Started!!...");
		Scanner sc = new Scanner(System.in);
		try
		{
			IO.print("Enter the first integer (a): ");
			int a = sc.nextInt();
			IO.print("Enter the second integer (b): ");
			int b = sc.nextInt();
			IO.println("You entered a = "+a+" and b = "+b);
		}
		catch(InputMismatchException e)
		{
			IO.println("getMessage():=> "+e.getMessage());
			IO.println("toString():=> "+e.toString());
			IO.println("println():=> "+e+" occurred. Please enter only integer numbers.");
			IO.println("printStackTrace():=> ");
			e.printStackTrace();
		}
		sc.close();
		//IO.print("Main Method Ended!!...");
	}
}