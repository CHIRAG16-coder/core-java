package com.chirag.exception_try_catch_methods;

import java.util.Scanner;

public class AreaCalculator 
{

	public static double calculateArea(double length, double width) 
	{
		double area = length * width;
		return area;
	}

	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  double length = Double.parseDouble(IO.readln("Enter length of rectangle: "));
	  double width = Double.parseDouble(IO.readln("Enter width of rectangle: "));

		try(sc) 
		{
			if (length <= 0 || width <= 0) 
			{
				throw new IllegalArgumentException("Error: Length and width must be > 0.");
			}
			double area = calculateArea(length, width);
			IO.println("Area of rectangle with length " + length + " and width " + width + " is: " + area);	
		} 
		catch (IllegalArgumentException e) 
		{
			IO.println(e.getMessage());
		}
		
	}

}
