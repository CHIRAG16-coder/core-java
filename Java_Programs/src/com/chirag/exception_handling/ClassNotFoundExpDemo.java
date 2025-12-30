package com.chirag.exception_handling;

import java.util.Scanner;

public class ClassNotFoundExpDemo  
{
   public  ClassNotFoundExpDemo(String className) throws ClassNotFoundException
   {
	 try
	 {
		 Class<?> name = Class.forName(className);
		 IO.print("Class loaded successfully: "+name.getName());
		 
	 }
	 catch(ClassNotFoundException e)
	 {
		 IO.print("Error: "+className+" not found.");
		 e.printStackTrace();
	 }
   }
	
   public static void main(String[]args) throws ClassNotFoundException
   {
	   Scanner sc = new Scanner(System.in);
	   String str = IO.readln("Enter the class name to load: ");
	   new ClassNotFoundExpDemo(str);
	   sc.close();
   }
}
