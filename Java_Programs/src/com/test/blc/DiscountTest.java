package com.test.blc;

import java.util.Scanner;

public class DiscountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Discount d = new Discount();
		
		System.out.println("Enter Customer name :");
		String  name = sc.nextLine();
		
		System.out.println("Enter total bill Amount :");
		int bill = Integer.parseInt(sc.nextLine());
		
		System.out.println("------ BILL SUMMARY ------");
		
		System.out.println("Customer Name: "+name);
		System.out.println("Original Bill: "+bill);
		System.out.println("Amount Payable after Discount: "+d.calculateDiscount(bill));
		
	
		sc.close();
		
		
		
	}

}
