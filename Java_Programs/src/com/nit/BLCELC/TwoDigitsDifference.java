package com.nit.BLCELC;

public class TwoDigitsDifference {
 public static int getDiffOfDigits(int num)
 {
	 int temp=0;
	 while(num>=9)
	 {
		 temp=num%10;
		 num/=10;
	 }
	 	return num-temp;
}
}
