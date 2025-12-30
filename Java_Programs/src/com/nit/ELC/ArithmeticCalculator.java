package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.Calculator;

public class ArithmeticCalculator {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Numbers : ");
		int num1=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Second Numbers : ");
		int num2=Integer.parseInt(sc.nextLine());
		System.out.println("Addition of two no: "+Calculator.add(num1, num2));
		System.out.println("Subtraction of two no: "+Calculator.sub(num1, num2));
		System.out.println("Muplication of two no: "+Calculator.mul(num1, num2));
		System.out.println("division of two no: "+Calculator.div(num1, num2));
		sc.close();
	}

}
