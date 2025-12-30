package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.Circle;

public class FindAreaOfCircle {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Raidus : ");
		double radius = Double.parseDouble(sc.nextLine());
		
		String areaOfCircle = Circle.getAreaOfCricle(radius);
		System.out.println("Area of Circle without format : "+areaOfCircle);
		
		double area =Double.parseDouble(areaOfCircle);
		System.out.printf("Area Is %.2f",area);
		
		sc.close();
		
	}
}
