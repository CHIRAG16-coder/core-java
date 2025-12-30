package com.nit.BLCELC;

public class Bank
{
	private String customerName;
	private int accountNumber;
	private double currentBalance;
	
	static String bankName="ICICI Bank";
	static String bankAddress="HYD";
	static String bankIFSCCode="MAHG00542";
	
	public void setCustomerDeatils(String name, int accNumber, double balance )
	{
		customerName = name;
		accountNumber = accNumber;
		
	  if(balance<=0)
	  {
		  System.err.println("Error mss");
		  System.exit(0);
	  }
	 currentBalance = balance;	
	 System.out.println("Customer account created successfully!  ");
	}
	
	
	public void withdraw(double amount)
	{
		if (currentBalance < amount)
		{
			System.err.println("You have insufficient balance!");
			System.exit(0);
		}
			currentBalance = currentBalance-amount;
	//System.out.println("Withdrawal successful! ₹"+currentBalance+" debited.");
			System.out.println("Current Balance: ₹"+currentBalance);	
		
	}
	
	  public void deposit(double amount )
	  {
		  if(amount<=0)
		  {
			  System.err.println("Deposit amount should be greater than zero!");
			  System.exit(0);
		  }
		  currentBalance+=amount;
		 // System.out.println("Deposit successful! ₹"+currentBalance+" credited.");
		  System.out.println("Current Balance: ₹"+currentBalance);
	  }
	  
	  
	  public double getCurrentBalance()
	  {
		  return currentBalance;
	  }


	  @Override
	  public String toString() {
		return "Customer [Name = " + customerName + ", AccountNumber = " + accountNumber + ", Balance = "
				+ currentBalance + "]";
	  }
	   
	  
}
