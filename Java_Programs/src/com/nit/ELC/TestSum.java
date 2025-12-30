package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.TwoDigitsDifference;

public class TestSum {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Two Digits No: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("Result is :"+TwoDigitsDifference.getDiffOfDigits(num));
	}

}
