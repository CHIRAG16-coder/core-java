package com.chirag.test;
//153=1^3+5^3+3^3=153 
public class ArmStrongNumber 
{
	public static void main(String[] args) {
		
	
	int num;
	public ArmStrongNumber(int num) 
	{
		this.num=num;
	}
	
	public void CheckArmStrongNumber() 
	{
		int temp=num;
		int temp2=num;
		int count=0;
		while(temp!=0) {//153
			
			count++;//1 2 3   power= 3
			temp/=10;//15 1 0
		}
		//count=3
		 int sum=0;
		 while(temp2!=0) 
		 {
			 int d=temp2%10;//3  5 1
			 int mul=1;
			
			 for(int i=1;i<=count;i++) {
				 mul=mul*d;//3*3*3=27  5*5*5 =125 1
			 }
			  sum=sum+mul;//sum=27+125+1=153
			  temp2/=10;//15 1 0
		 }
		if(sum == num) {
			System.out.println( num+":is arm stromg number");
		}else {
			System.err.println(num+":is  not arm stromg number");
		}
		
	}
	}
}