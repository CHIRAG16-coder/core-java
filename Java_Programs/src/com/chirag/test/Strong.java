//7. Strong number
//A strong number is a number whose sum of the factorials of its individual digits is equal to the original number.
//Examples:
//1: 1!=1
//2: 2!=2
//145: 1!+4!+5!=1+(4×3×2×1)+(5×4×3×2×1)=1+24+120=145
package com.chirag.test;

public class Strong
{
 int num;
 public Strong(int num) 
 {
 this.num=num;
}
 public void CheckStrongNumber() {
	 int temp=num;//145
	 int sum=0;
	while(temp!=0) {
		int d=temp%10;// 5
		int fact=1;
		for(int i=d;i>=1;i--) {
			fact=fact*i;
		}
		sum=sum+fact;
		temp/=10;	
	}
	if(sum==num) {
		System.out.println(num+" :is stromg number");
	}else {
		System.err.println(num+" :is not stromg number");
	}
 }
 
}