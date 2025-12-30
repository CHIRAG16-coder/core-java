package com.chirag.interface_program;

import java.util.Scanner;

sealed interface Payment permits CreditCardPayment, DebitCardPayment ,UPIPayment
{
	void makePayment(double amount);
	void makeRefund(double amount);
}

// Credit Card Payment Mode Implements From Payment Interface

non-sealed class CreditCardPayment implements Payment
{
	private String cardHolderName;

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid RS :"+amount+" using Credit Card Holder : "+cardHolderName);
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Refunded RS :"+amount+" to Credit Card Holder : "+cardHolderName);
		
	}

	public CreditCardPayment(String cardHolderName) 
	{
		super();
		if(cardHolderName == null || cardHolderName.isBlank())
		{
			System.err.println("Enter Card Holder Name Cann't Be Null");
			System.exit(0);
		}
		this.cardHolderName = cardHolderName;
	}	
}

//Debit Card Payment Mode Implements From Payment Interface

non-sealed class DebitCardPayment implements Payment
{
		private String bankName;
	@Override
	public void makePayment(double amount) {
		System.out.println("Paid RS :"+amount+" using Debit Card Bank: "+bankName);	
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Refunded RS :"+amount+" to Debit Card Bank: "+bankName);
		
	}

	public DebitCardPayment(String bankName) {
		super();
		if(bankName == null || bankName.isBlank())
		{
			System.err.println("Enter Bank Name Cann't Be Null");
			System.exit(0);
		}
		this.bankName = bankName;
	}
	
	
}

//UPI Payment Mode Implements From Payment Interface

non-sealed class UPIPayment implements Payment
{
	private String upiId;

	@Override
	public void makePayment(double amount) {
		System.out.println("Paid RS "+amount+" using UPI ID : "+upiId);
	}

	@Override
	public void makeRefund(double amount) {
		System.out.println("Refunded RS "+amount+" to UPI ID : "+upiId);
	}

	public UPIPayment(String upiId) {
		super();
		if(upiId == null || upiId.isBlank())
		{
			System.err.println("Enter UPI ID Cann't Be Null");
			System.exit(0);
		}
		this.upiId = upiId;
	}		
}

class ShoppingCart
{
	private double totalAmount;

	public ShoppingCart(double totalAmount) 
	{
		super();
		if(totalAmount<=0)
		{
			System.err.println("Enter Amount Should Be Positive.");
			System.exit(0);
		}
		this.totalAmount = totalAmount;
	}
	
	public void checkOut(Payment payment)
	{
		System.out.println("Starting checkout for amount RS :"+this.totalAmount);
		payment.makePayment(totalAmount);
	}
	
	public void cancelOrder(Payment payment)
	{
		System.out.println("Order Canceled. Initiating Refund...");
		System.out.println("Cancelling order for amount RS :"+this.totalAmount);
		payment.makeRefund(totalAmount);
	}
	
}

public class Customer 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your total bill Amount :");
		double totalAmount = Double.parseDouble(sc.nextLine());
		
		System.out.println("Choose Payment Method:\r\n"
				+ "1. Credit Card\r\n"
				+ "2. Debit Card\r\n"
				+ "3. UPI");
		
		int choice = Integer.parseInt(sc.nextLine());
		ShoppingCart shop = new ShoppingCart(totalAmount);
		switch(choice)
		{
			case 1 ->
				{
					System.out.print("Enter the Card HolderName: ");
					String cardHolderName = sc.nextLine();
					Payment credit = new CreditCardPayment(cardHolderName);
			
					shop.checkOut(credit);
					System.out.println();
					shop.cancelOrder(credit);
				}
			case 2 ->
				{
					System.out.print("Enter Your Bank Name :");
					String bankName = sc.nextLine();
					Payment debit = new DebitCardPayment(bankName);
					
					shop.checkOut(debit);
					System.out.println();
					shop.cancelOrder(debit);
				}
			case 3 ->
				{
					System.out.print("Enter Your UPI_ID :");
					String upiId = sc.nextLine();
					Payment upi = new UPIPayment(upiId);
				    
					shop.checkOut(upi);
					System.out.println();
					shop.cancelOrder(upi);
				}
		}

	}

}


