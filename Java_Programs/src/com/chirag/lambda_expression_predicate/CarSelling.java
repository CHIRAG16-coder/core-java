package com.chirag.lambda_expression_predicate;

import java.util.function.Predicate;

record Car(String brand, Double price,Integer mileage) {}

public class CarSelling
{
	public static void main(String[] args)
	{
		String brand = IO.readln("Enter the brand name of the Car :");
		Double price = Double.parseDouble(IO.readln("Enter the price of the Car :"));
		Integer mileage = Integer.parseInt(IO.readln("Enter the mileage of the Car :"));
		
		Car car = new Car(brand, price, mileage);
		
		Predicate<Car> isEligibleSale = car1 ->
		{
			return (car1.price()<=500000) && (car1.mileage()>=20);
		};
		
		if(isEligibleSale.test(car))
		{
			IO.println(brand+" is eligible for sale");
		}
		else 
		{
			System.err.println(brand+" is not eligible for sale");
		}
	}

}
