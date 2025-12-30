package com.chirag.interface_program;

import java.util.Scanner;

interface Payments 
{
	abstract public void processPayment();
	abstract public void applyDiscount();
}


class CreditCardPayments implements Payments
{

	@Override
	public void processPayment() {
		IO.println("Initiating Credit Card payment\r\n"
				+ "Processing Credit Card payment...");
	}

	@Override
	public void applyDiscount() {
		IO.println("Applying 10% discount for Credit Card payment");	
	}
	
}
class UPIPayments implements Payments 
{

	@Override
	public void processPayment(){
		IO.println("Initiating UPI payment\r\n"
				+ "Processing UPI payment...");	
	}

	@Override
	public void applyDiscount() {
		IO.println("Applying 5% discount for UPI payment");	
	}
	
}

class PaymentGateway
{
	public Payments initiatePayment(String paymentType)
	{
		if(paymentType.equalsIgnoreCase("creditcard"))
		{
		    return new 	CreditCardPayments();
		}
		else if(paymentType.equalsIgnoreCase("UPI"))
		{
			return new UPIPayments();
		}
		else
		{
			System.err.println("Invalid payment type selected!");
			System.exit(0);
		}
		
		return null;
	}
	
}

public class PaymentGatewayUsingInterface 
{

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
        IO.println("Enter Payment Type [CreditCard / UPI]:");
        String input =  sc.next().toLowerCase();
        
        PaymentGateway pay = new PaymentGateway();
        Payments pays = pay.initiatePayment(input);
        pays.processPayment();
        pays.applyDiscount();
       
	}

}
