package com.test.blc;

public class Hotel {
	public static double calculateTotalAmount(double roomRate,int days)
	{
		return roomRate*days;
	}
	public static  double calculateDiscountedAmount(int days,double totalAmount)
	{
		double discountPercentage;
		if(days>=10)
		{
			discountPercentage=20;
		}
		else if(days>=5 && days<=9) 
		{
			discountPercentage=10;
			
		}
		else if(days>=3 && days<=4) 
		{
			discountPercentage=5;
			
		}
		else
		{
			discountPercentage=0;
		}
		double discountedAmount = totalAmount-totalAmount*(discountPercentage/100);
        return discountedAmount;

	}
	


}