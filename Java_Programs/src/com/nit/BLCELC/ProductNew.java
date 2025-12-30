package com.nit.BLCELC;

public class ProductNew 
{
	private int id ;
	private String name;
	private double price;
	
	public void setProductDetails(int id, String name, double price)
	{
		this.id = id ;
		this.name = name;
		this.price = price;
	}
	
	
	public void calculateDiscount()
	{   
		double dist = 0;
		if(this.price < 1000)
		{ 
			dist = price*0.05;
		}
		else if (this.price >= 1000 && this.price <= 5000)
		{
			dist = price*0.10;
		}
		else 
		{
			dist = price*0.15;
		}
		price = price - dist ;
		System.out.println("Discount Amount: "+dist);
		System.out.println("Price After Discount: "+price);
	}


	@Override
	public String toString() {
		return "Product [productId=" + id + ", productName=" + name + ", productPrice=" + price + "]";
	}
	
	
}
