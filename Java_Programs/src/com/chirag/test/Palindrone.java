package com.chirag.test;

public class Palindrone 
{
	public static void main(String[] args) {
		
	
	 int n = 121,rev = 0,temp = n;
	 
	 while (temp>0)
	 {
		 rev = rev*10 + temp%10;
		 temp/=10;
	 }
	 
	 if(n==rev)
	 {
		 System.out.println(n+" is Pailndrone");
	 }
	 else
	 {
		 System.out.println(n+" is not Pailndrone");
	 }
}
}
