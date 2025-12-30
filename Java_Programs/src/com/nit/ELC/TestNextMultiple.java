package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.NextMultipleOfHundred;

public class TestNextMultiple {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Result is : "+NextMultipleOfHundred.getNextMultipleOfHundred(n));
		
	}

}
