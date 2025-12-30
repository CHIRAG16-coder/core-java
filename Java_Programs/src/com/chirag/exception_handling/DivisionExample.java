package com.chirag.exception_handling;

public class DivisionExample 
{
	public static int performDivision(int dividend,int divisor)
	{
		int result = 0;
		try 
		{
			result = dividend/divisor;
			IO.print("Result of division : "+result);
		}
		catch(ArithmeticException e)
		{
			System.err.println("ArithmeticException caught: Division by zero: dividend="+dividend+", divisor="+divisor);
		}
		return result;
	}
   void main()
   {
	   
	   int dividend = Integer.parseInt(IO.readln("Enter dividend : "));
	   int divisor = Integer.parseInt(IO.readln("Enter divisor : "));
	   performDivision(dividend, divisor);
   }
}
