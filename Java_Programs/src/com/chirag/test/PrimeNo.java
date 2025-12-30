package com.chirag.test;
public class PrimeNo 
{
    int num;
  public PrimeNo(int num) 
  {
	 this.num=num;
  }

 public void CheckPrimeNumber() 
 {
	 int count=0;
	 for(int i=1;i<=num;i++) 
	 {
		 if(num%i==0) 
		 {
		 count++;
	     }
	 }
	 if(count==2) {
		 System.out.println(num+": is Prime number");
	 }else {
		 System.err.println(num+": is not prime number");
	 }
 }
}