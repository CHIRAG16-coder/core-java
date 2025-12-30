package com.chirag.exception_try_catch_methods;

import java.util.Scanner;

public class ArrayStoreExample 
{
	public static void storeObjects()
	{
		Object[] String = new String[5];
		String[0]="Hello";
		String[1]="World";
		String[2]="Java";
		IO.println("Objects stored successfully.");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			storeObjects();
		}
		catch(ArrayStoreException e)
		{
			IO.println("ArrayStoreException caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String");	
		}
	}
}
