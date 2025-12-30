package com.chirag.shoppingmall;

import java.util.Scanner;

public class ShoppingMall 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Customer Type to get additional Discount :\r\n"
				+ "		 1) General Customer \r\n"
				+ "		 2) Prime Customer \r\n"
				+ "		 3) VIP Customer ");
		System.out.println("Please enter Customer type :");
		int choice = Integer.parseInt(sc.nextLine());
		
		System.out.println("Please Enter your Name :");
		String name = sc.nextLine();
		
	    System.out.println("Enter number of Items :");
	    int item = Integer.parseInt(sc.nextLine());
	    
	    System.out.println("Please Enter the Item Name and Price :");
	    double itemPrice[]= new double [item];
	    
	    for(int i=0;i<item;i++)
	    {
	    	String itemName = sc.nextLine();
	    	itemPrice[i]= Double.parseDouble(sc.nextLine());
	    }
	    
	    
	    switch(choice)
	    {
	       case 1 ->
	       {
	    	   Customers cust = new GeneralCustomer(name);
		       generateBill(cust,itemPrice);
	       }
	       
	       case 2 ->
	       {
	    	   Customers cust = new PrimeCustomer(name);
	    	   generateBill(cust, itemPrice);
	       }
	       case 3 ->
	       {
	    	   Customers cust = new VIPCustomer(name);
	    	   generateBill(cust, itemPrice);
	       }
	    }
	}





public static void generateBill(Customers cust, double ...prices)
{
	cust.calculateBill(prices);
}



}
