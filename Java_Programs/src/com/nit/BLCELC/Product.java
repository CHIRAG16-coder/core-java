package com.nit.BLCELC;

public class Product
{
			int productId ;
			String productName;
			double productPrice;
		

	public void setProductData(int id, String name, double price) 
		{
			productId = id;
			productName = name;
			productPrice = price;
		}
		
	public void getProductInfo()

		{
			System.out.println("Product Id    : "+productId);
			System.out.println("Product Name  : "+productName);
			System.out.println("Product Price : "+productPrice);
		}
	
}	