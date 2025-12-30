package com.chirag.exception_try_catch_methods;

public class IllegalStateExceptionDemo
{
	
	void main()
	{
		IO.println("Calling throw IllegalException from main method:");
		throwIllegalStateException();
	}
	
	static void throwIllegalStateException()
	{
		try
		{
			throw new IllegalStateException("MyException");
		}
		catch(IllegalStateException e)
		{
			IO.println("Caught: "+e);
		}
	}
}