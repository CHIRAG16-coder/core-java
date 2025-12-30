package com.nit.BLCELC;

public class TwoDigitsSum {
	public static void getSumOfDigits(int n)
	{
		int sum=0;
		while(n!=0)
		{
			
			sum+=(n%10);
			n/=10;
		}
		System.out.println("Sum of Two Digit: "+sum);
	}
}
