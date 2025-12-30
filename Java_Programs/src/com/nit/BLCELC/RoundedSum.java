package com.nit.BLCELC;

public class RoundedSum {
	 public static int sumOfRoundedValues(int num1 ,int num2 ,int num3)
	 {
		 int n1=(num1%10)>5 ? (num1/10+1)*10 : (num1/10)*10;
		 int n2=(num2%10)>5 ? (num2/10+1)*10 : (num2/10)*10;
		 int n3=(num3%10)>5 ? (num3/10+1)*10 : (num3/10)*10;
		 
		 return (n1+n2+n3);

	 }
}
