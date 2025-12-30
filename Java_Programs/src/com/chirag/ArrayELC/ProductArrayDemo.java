package com.chirag.ArrayELC;

import java.util.Arrays;
import java.util.Scanner;

import com.chirag.ArrayBLC.Product;

public class ProductArrayDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of products: ");
		int size = Integer.parseInt(sc.nextLine());
		
		Product[] arr = new Product[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter deatils for Product "+(i+1)+":");
			System.out.print("Enter Product ID: ");
			int pid = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Product Name: ");
			String pname = sc.nextLine();
			System.out.print("Enter Product Price: ");
			double pprice = Double.parseDouble(sc.nextLine());
			arr[i]= new Product(pid,pname,pprice);
		}
		//Product product = new Product();
		System.out.print("Enter Product ID to search: ");
		int search = Integer.parseInt(sc.nextLine());
		//int id = product.getId();
		
		boolean isFound=false;
		
		for(int i=0;i<size;i++)
		{
			if(arr[i].getId()==search)
			{
				isFound=true;
				System.out.println(arr[i]);
				break;
			}
		}
		
		if(!isFound)
		{
			System.out.println("Product with ID "+search+" not found.");
		}
		

	}

}
