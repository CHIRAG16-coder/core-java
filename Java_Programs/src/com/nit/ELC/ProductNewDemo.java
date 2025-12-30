package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.ProductNew;

public class ProductNewDemo {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ProductNew p = new ProductNew();
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Product ID: ");
		int id = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Product Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Product Price: ");
		double price = Double.parseDouble(sc.nextLine());
		
		System.out.println("");
		p.setProductDetails(id, name, price);
		
		
		System.out.println("----- Product Details -----");
		System.out.println(p);
		System.out.println("");
		
		
		p.calculateDiscount();
		sc.close();
	}

}
