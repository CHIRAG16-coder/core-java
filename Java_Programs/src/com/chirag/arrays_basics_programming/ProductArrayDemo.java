package com.chirag.arrays_basics_programming;

import java.util.Scanner;

//-----BLC------
class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}	
}
//-----ELC-----
public class ProductArrayDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(IO.readln("Enter number of products: "));

		Product[] prods = new Product[size];
		
		for (int i = 0; i < prods.length; i++) 
		{
			IO.println("Enter details for Product "+(i+1)+":");
			int id = Integer.parseInt(IO.readln("Enter Product ID: "));
			String name = IO.readln("Enter Product Name: ");
			double price = Double.parseDouble(IO.readln("Enter Product Price: "));
			IO.println("");
			prods[i]= new Product(id, name, price);
		}
		
		int searhID = Integer.parseInt(IO.readln("Enter Product ID to search: "));
		boolean isFound=false;
		for (Product product : prods) 
		{
			if(product.getId() == searhID) 
			{
				isFound = true;
				IO.print("Product Found: "+product);
				break;
			}
		}
		if(!isFound) IO.println("Product with ID "+searhID+" not found.");
		sc.close();
	}
}
