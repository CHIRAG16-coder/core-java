package com.chirag.method_overriding;

import java.util.*;

public class BankApplication 
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice :");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        System.out.println("3. Fixed Deposit Account");
		int choice =Integer.parseInt(sc.nextLine());
		
		switch(choice)
		{
		    case 1->
		    {
			System.out.println("Enter account holder name :");
			String name=sc.nextLine();
			
			System.out.println("Enter account number :");
			String number=sc.nextLine();
			
			System.out.println("Enter the Amount :");
			double balance=sc.nextDouble();
			
			BankAccount b=new SavingsAccount(name,number,balance);
			b.displayAccountDetails();
			b.calculateInterest();
		    }
		    
		    case 2->
		    {
			System.out.println("Enter account holder name :");
			String name=sc.nextLine();
			
			System.out.println("Enter account number :");
			String number=sc.nextLine();
			
			System.out.println("Enter the Amount :");
			double balance=sc.nextDouble();
			
			CurrentAccount c=new CurrentAccount(name,number,balance);
			c.displayAccountDetails();
			c.calculateInterest();
			c.checkOverdraftLimit();
		    }
		
		    case 3->
		    {
			System.out.println("Enter account holder name :");
			String name=sc.nextLine();
			
			System.out.println("Enter account number :");
			String number=sc.nextLine();
			
			System.out.println("Enter the Amount :");
			double balance=sc.nextDouble();
			
			System.out.println("Enter deposit term (years): ");
            int term = sc.nextInt();
            
			BankAccount b= new FixedDepositAccount(name,number,balance,term);
			b.displayAccountDetails();
			b.calculateInterest();
		    }
		    
		    default -> System.out.println("Invalid Choice!");
		 }
		sc.close();
	}
		
}

class BankAccount
{
	protected String accountHolderName;
	protected String accountNumber;
	protected double balance;
	public static final String IFSC_CODE="SBIHYD151285";
	
	public BankAccount(String accountHolderName,String accountNumber,double balance )
	{
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
		if(balance<=0)
		{
			System.out.println("Balance cannot be negative.");
			System.exit(0);
		}
		this.balance=balance;
	}
	
	public void calculateInterest()
	{
		System.out.println("Current Accounts do not earn interest.");
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Enter account Holder name:"+accountHolderName);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance:"+balance);
		System.out.println("IFSC CODE :"+IFSC_CODE);	
	}
	
	public void checkOverdraftLimit()
	{
		System.out.println("checkOverdraftLimit");
	}
	
}

class SavingsAccount extends BankAccount
{
	protected double interestRate=4.0;

    public SavingsAccount(String accountHolderName,String accountNumber,double balance)
    {
    super(accountHolderName,accountNumber,balance);
    }
    
    public void calculateInterest()
    {
      System.out.println("Interest Rate is :"+(balance*interestRate)/100);
      System.exit(0);
    }
}
      
class CurrentAccount extends BankAccount
{
    protected double overdraftLimit=5000.0;
    	  
    public CurrentAccount(String accountHolderName,String accountNumber,double balance)
    {
      super(accountHolderName,accountNumber,balance);
    }
      
    public void calculateInterest() 
    {
    System.out.println("Current accounts do not earn interest."); 
    }
             
    public void checkOverdraftLimit()
    {
      System.out.println("overdraftLimit amount is:"+overdraftLimit);
    }
}
      
class FixedDepositAccount extends BankAccount
{
   protected double interestRate=6.5;
   protected int depositTerm;
    	  
   public FixedDepositAccount(String accountHolderName,String accountNumber,double
         		 balance,int depositTerm)
   {
       super(accountHolderName,accountNumber,balance);
       if(depositTerm<=0)
        {
         	System.out.println("depositTerm can't be negative.");
     		System.exit(0);
        }
        else 
        {
            this.depositTerm=depositTerm;
        }
    }
   
    public void calculateInterest()
    {
    	double d=(balance*6.5/100)*depositTerm;
    	System.out.println("Fixed Deposit Interest for"+depositTerm+"years RS:"+d);
    			  
     }
 }