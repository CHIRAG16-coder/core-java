package com.nit.BLCELC;

public class CalculateCircleArea {
	public static String getArea(double radius)
	{
		int n=0 ;
		if(radius<0)
		{
			return ""+(0);
		}
		else
		{
			final double PI = 3.14;
			double area = PI*radius*radius;
			return ""+(area);
		}
	}
}
