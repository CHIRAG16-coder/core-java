package com.nit.ELC;


import java.util.Scanner;

import com.nit.BLCELC.Square;

public class FindSqaure {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Side of the Square : ");
		
		int num=Integer.parseInt(sc.nextLine());
		System.out.println("Area of Square is : "+Square.getAreaOfSquare(num));
		sc.close();
	}

}
