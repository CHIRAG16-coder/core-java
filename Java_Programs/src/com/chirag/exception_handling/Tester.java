package com.chirag.exception_handling;

class ParentClass
{
	public void loadingClass(String className) throws ClassNotFoundException
	{
		Class<?> name = Class.forName(className);
		IO.println("Class "+name.getName()+" loaded successfully.");
		
	}
}
class ChildClass extends ParentClass
{
	@Override
	public void loadingClass(String className) throws IllegalArgumentException, ClassNotFoundException
	{
		if(className==null || className.isEmpty())
		{
			throw new IllegalArgumentException("Error: Class not found - "+className);
		}
		else 
		{
			super.loadingClass(className);
		}
	}
}
public class Tester 
{
	public static void main(String[] args) 
	{
		ParentClass pr = new ChildClass();
		for(int i=0;i<args.length;i++)
		{
		  try
		  {
			  String name = args[i];
			  pr.loadingClass(name);
		  }
		  catch(ClassNotFoundException e)
		  {
			  IO.println("Error: Class not found - "+e);
		  }
		  catch(IllegalArgumentException e)
		  {
			  // IO.println("Error: Class not found - "+e);
			  IO.println(e.getMessage());
		  }
		}   
	}
}