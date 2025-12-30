package com.chirag.exception_handling;

import java.util.Scanner;

public class ExceptionHandlingDemo 
{
	
	public static void handleExceptions(String str)
	{
		try 
		{
			IO.println("Length of the input string: "+str.length());
			int covertedString = Integer.parseInt(str);
			IO.println("Converted to integer: "+covertedString);
			
//			if(covertedString <=0 ) 
//			{
//				str = null;
//			}
			IO.println("Uppercase version: "+str.toUpperCase());
		}
		catch(NumberFormatException e)
		{
			System.err.println("NumberFormatException: Input is not a valid integer.");
		}
		catch(NullPointerException e)
		{
			System.err.println("NullPointerException: Input is null.");
		}
	}
	
	
   void main()
   {
	   Scanner sc = new Scanner(System.in);
	   IO.print("Input : ");
	   String input = sc.nextLine();
	   
	  
	   if(input.isBlank())
	   {
		   input=null;
	   }
	   handleExceptions(input);
	   sc.close();
   }
}
