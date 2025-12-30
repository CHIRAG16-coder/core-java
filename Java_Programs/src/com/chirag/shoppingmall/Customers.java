package com.chirag.shoppingmall;

public class Customers
{
 
	protected String name;
    protected double total;
    
    public Customers(String name)
    {
    	if(name.isBlank())
    	{
    		System.out.println("Customer name cannot be empty.");
    		System.exit(0);
    	}
    	this.name = name;
    }
    
    public double calculateBill(double...prices)
    {
    	 double totalbill=0;
    	for(double price : prices)
    	{    		
    		if(price<=0)
    		{
    			System.out.println("Item price cannot be negative.");
    			System.exit(0);
    		}
    		totalbill = totalbill + price;	
    	}
		return totalbill;
		
    }
    
    public void printDetails()
    {
    	System.out.println("Welcome to Hyderabad Mall:");
    	System.out.println("Customer: "+name);
    	System.out.println("Total cost RS : "+total);
    	
    }
}


class GeneralCustomer extends Customers
{
	public GeneralCustomer(String name)
	{
		super(name);
	}
	@Override
	public double calculateBill(double ...prices)
	{
		super.printDetails();
		System.err.println("no discount for general customer.");
		double total = super.calculateBill(prices);
		return total;
	}
	
}



class PrimeCustomer extends Customers
{
	protected double discountRate = 10.0;
	
	public PrimeCustomer(String name)
	{
		super(name);
	}
	
	@Override
	public double calculateBill(double ...prices)
	{
		double total = super.calculateBill(prices);
		return total;
		
	}
	
	public void printDetails()
	{
		super.printDetails();
		System.out.println("Discount RS : "+(total*0.10));
		System.out.println("Final amount RS: "+(total-(total*0.10)));

	}
	
}

class VIPCustomer extends Customers
{
	protected double discountRate = 15.0;
	
	public VIPCustomer(String name)
	{
		super(name);
	}
	
	@Override
	public double calculateBill(double ...prices)
	{
		double total = super.calculateBill(prices);
		return total;
	}
	
	public void printDetails()
	{
		super.printDetails();
		System.out.println("Discount RS : "+(total*0.15));
		System.out.println("Final amount RS: "+(total-(total*0.15)));
	}
	
}