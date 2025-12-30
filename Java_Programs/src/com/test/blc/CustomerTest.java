package com.test.blc;

import java.util.Scanner;

public class CustomerTest
{
		public static void main(String[]args)
		{
			Scanner sc =new Scanner(System.in); 
			Customer c = new Customer();
			
			System.out.println("Enter your id :");
			int id = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter your Name :");
			String name = sc.nextLine();
			
			System.out.println("Enter your bill :");
			double bill = Double.parseDouble(sc.nextLine());
			
			System.out.println(c.getCustomerDetails(id, name, bill));
			
			
			sc.close();
			
			
		}
}
