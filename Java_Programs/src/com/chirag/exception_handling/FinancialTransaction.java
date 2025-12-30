package com.chirag.exception_handling;

class FinancialTransaction 
{
	public void processTransaction(double amount,long Accountnumber)
	{
		if(amount<=0) throw new IllegalArgumentException(); new NumberFormatException();
	}
     
	void main()
	{
		FinancialTransaction pay = new FinancialTransaction();
		
		try
		{
			double amount = Double.parseDouble(IO.readln("Transaction amount: "));
			long Accountnumber = Long.parseLong(IO.readln("Account number: "));
			pay.processTransaction(amount, Accountnumber);
			IO.println("Processing transaction...");
			IO.println("Transaction successful: Amount Rs."+amount+"\n transferred to account "+Accountnumber);
		}
		catch(NumberFormatException e)
		{
			IO.println("Invalid input: Please enter a valid number for transaction amount.");
		}
		catch(IllegalArgumentException e)
		{
			IO.println("Error processing transaction: Transaction amount must be positive.");
		}
	}
	

}
