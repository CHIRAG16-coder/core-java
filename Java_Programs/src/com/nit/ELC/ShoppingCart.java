package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.Discount;

public class ShoppingCart {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Total Bill Amount: ");
		double totalbill = Double.parseDouble(sc.nextLine());
		
		System.out.println("-------------BILL SUMMARY------------");
		System.out.println("Customer Name                : "+name);
		System.out.println("Original Bill                : "+totalbill);
		System.out.println("Amount Payable after Discount: "+Discount.calculateDiscount(totalbill));
		
		

	}

}
