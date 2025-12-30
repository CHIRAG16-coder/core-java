package com.chirag.exception_handling;

public class CommandLineDivision {

	public static void main(String[] args) 
	{
		IO.println("CommandLine Inputs : ");
		try
		{
			if(args.length==2)
			{
			   int dividend = Integer.parseInt(args[0]);
			   int divisor = Integer.parseInt(args[1]);
			
			  try
			  {
				double result = dividend/divisor;
				IO.println("Division result: "+result);
			  }
			  catch(ArithmeticException e)
			  {
				IO.println(e);
			  }
			}
			else throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException e)
		{
			IO.println(e);
		}
		IO.println("Division operation completed.");
	}

}
