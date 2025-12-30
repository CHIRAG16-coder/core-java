package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.RoundedSum;

public class TestRoundedSum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Three Number :");
		int a = Integer.parseInt(sc.nextLine());
		int b = Integer.parseInt(sc.nextLine());
		int c = Integer.parseInt(sc.nextLine());
		System.out.println("Result is : "+RoundedSum.sumOfRoundedValues(a, b, c));
	}

}
