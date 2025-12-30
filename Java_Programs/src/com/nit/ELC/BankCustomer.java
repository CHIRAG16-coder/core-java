package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.Bank;

public class BankCustomer {

	public static void main(String[] args)
	{
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== Welcome to ICICI Bank =====");
		System.out.print("Enter Customer Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Account Number : ");
		int number = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter Opening Balance : ");
		double bal = Integer.parseInt(sc.nextLine());
		
		b.setCustomerDeatils(name, number, bal);
		
		System.out.println(" ");
		
		
		while(true)
		{
			System.out.println("===== MENU =====");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Display Customer Details");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch (choice)
			{
			case 1 ->{
				System.out.print("Enter deposit amount: ");
				double amount = Double.parseDouble(sc.nextLine());
			    b.deposit(amount);
			    System.out.println("Deposit successful! ₹"+amount+" credited.");
			}
			case 2 ->
			{
				System.out.print("Enter withdrawal amount: ");
				double amount = Double.parseDouble(sc.nextLine());
				b.withdraw(amount);
				System.out.println("Withdrawal successful! ₹"+amount+" debited.");
			}
			case 3 -> 
			{
			System.out.println("Current Balance: ₹"+b.getCurrentBalance());	
			}
			
			case 4 ->
			{
				System.out.println(b.toString());
			}
			case 5 ->
			{
				System.out.println("Thank you for banking with ICICI Bank!");
				sc.close();
				System.exit(0);
			}
			default ->
			{
				System.out.println("Enter the option bewteen 0-5 only!");
			}
			
			}
			System.out.println();
			
		}
	}

}
