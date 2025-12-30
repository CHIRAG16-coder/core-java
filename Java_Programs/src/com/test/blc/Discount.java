package com.test.blc;

public class Discount {
		double billAmount=0;
		double discount=0;
		public static double calculateDiscount(double billAmount) {
		if(billAmount >= 5000)
		{
			double discount1=(20*billAmount)/100;
			return billAmount-discount1;
		}
		else if(billAmount >= 3000)
		{ 
			double discount2=(15*billAmount)/100;
			return billAmount-discount2;
		}
		else if(billAmount >= 1000)
		{
			double discount3=(20*billAmount)/100;
			return billAmount-discount3;
		}
		else
		{
			double discount4=(5*billAmount)/100;
			return billAmount-discount4;
			
		}
		
	}

}
