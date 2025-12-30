package com.chirag.lambda_expression_function;

import java.util.function.Function;

record Product(Integer id, String name, Double price) {}

public class CalculateProductDiscount 
{
	public static void main(String[] args) 
	{
		Integer id = Integer.parseInt(IO.readln("Enter Product Id :"));
		String name = IO.readln("Enter Product Name :");
		Double price = Double.parseDouble(IO.readln("Enter Product Price :"));
		
		Function<Product,Double> calculate = calc ->
		{
			if (calc.price() >= 5000)
			{
				return (calc.price()-calc.price()*0.10);
			}
			else if (calc.price() <= 5000)
			{
				return (calc.price()-calc.price()*0.05);
			}
			else
			{	
				return calc.price();
			}	
		};
		Product product = new Product(id, name, price);
		IO.readln("Final price of the product is :"+calculate.apply(product));
	}
}
