package com.chirag.exception_handling;

public class ClassCastExceptionDemo 
{
	public static void handleClassCastException()
	{
		Object []obj1 = {"Hello", 123 , "Java"};
		for(Object obj: obj1)
		{
			try
			{
				String ele = (String)obj;
				IO.println("Casting successful: "+ele);
			}
		    catch(ClassCastException e)
		    {
		    	System.out.println(e.toString());
		    	e.printStackTrace();
		    	
		    }
		}
		
	}
       void main()
       {
    	   handleClassCastException();
       }
}
