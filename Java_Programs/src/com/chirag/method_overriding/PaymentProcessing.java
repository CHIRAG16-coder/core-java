package com.chirag.method_overriding;



class Payment 
{
	public void processPayment()
	{
		System.out.println("Processing payment");	
	}
}

class CreditCardPayment extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing credit card payment");	
	}
}

class DebitCardPayment extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing Debit Card payment");	
	}
}

class UPI extends Payment
{
	@Override
	public void processPayment()
	{
		System.out.println("Processing UPI payment");	
	}
}

public class PaymentProcessing 
{

	public static void main(String[] args) 
	{
		Payment payment = new Payment();
		Payment credit = new CreditCardPayment();
		Payment debit = new DebitCardPayment();
		Payment upi = new UPI();
        paymentGateway(payment,credit,debit,upi);
        
          
	}
	
	public static void paymentGateway(Payment... payments)
	{
		for(Payment payment : payments)
		{
			payment.processPayment();
		}
	}
	
}

