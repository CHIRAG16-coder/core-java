package com.chirag.exception_try_catch_methods;

import java.util.Scanner;

public class ArrayIndexExceptionDemo 
{
	void main()
	{
		
		Scanner sc = new Scanner(System.in);
		try
		{
			IO.println("Enter Index value : ");
			int index = sc.nextInt();
			int a[] = new int[2];
			a[0] = 10;
			a[1] = 20;
			IO.println(a[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			IO.println(e.getMessage());
			IO.println(e.toString());
			IO.println("You tried to access an invalid array index. Please check the index range.");
			e.printStackTrace();
		}
		sc.close();
	}
}