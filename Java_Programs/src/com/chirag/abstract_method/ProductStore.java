package com.chirag.abstract_method;

import java.util.Scanner;


abstract class Product 
{
	private String name ;
	private double price;
	private String category;
	
	public Product(String name, double price, String category)
	{
		super();
		if(name == null || name.isBlank())
		{
			System.out.println("Product name cannot be empty or null.");
			System.exit(0);
		}
		this.name = name;
		
		if(price<=0)
		{
			System.out.println("Price cannot be negative.");
			System.exit(0);
		}
		this.price = price;
		
		if(category==null || category.isBlank())
		{
			System.out.println("Category cannot be empty or null.");
			System.exit(0);
		}
		this.category = category;
	}
	
	abstract public void appplyDiscount(double percentage);
	
	abstract public double calculateTax();

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Product Name: "+name+"\r\n"
				+ "Category: "+category+"\r\n"
				+ "Price RS:"+price;
	}	
}


class DigitalProduct extends Product 
{
	private String licenseKey;

	public DigitalProduct(String name, double price, String category, String licenseKey)
	{
		super(name, price, category);
		this.licenseKey = licenseKey;
	}
	
	double discount=0.0;
	double priceAfterDiscount = 0;
	@Override
	public void appplyDiscount(double percentage)
	{
		double price = this.getPrice();
		discount = (price*percentage)/100;
		System.out.println("Discount applied :"+discount);
		
		priceAfterDiscount = price- discount;
        System.out.println("New Price :"+priceAfterDiscount);	
	}

	@Override
	public double calculateTax() 
	{
		return this.priceAfterDiscount*0.05;
	}

	@Override
	public String toString()
	{
		return "Digital Product :\r\n"
				+ super.toString()+"\r\n"
				+ "License Key: "+licenseKey;
	}
}


class PhysicalProduct extends Product
{
	private double shippingWeight ;

	public PhysicalProduct(String name, double price, String category, double shippingWeight) 
	{
		super(name, price, category);
		this.shippingWeight = shippingWeight;
	}
    
	double discount=0;
	double priceAfterDiscount = 0;
	
	@Override
	public void appplyDiscount(double percentage) 
	{
		double price = this.getPrice();
		discount = (price*percentage)/100;
		System.out.println("Discount applied :"+discount);
		
		priceAfterDiscount = price- discount;
        System.out.println("New Price :"+priceAfterDiscount);
	}

	@Override
	public double calculateTax() 
	{
		
		return super.getPrice()*0.08;
	}	
	
	public double calculateShippingCost()
	{
		return this.shippingWeight*5;
	}

	@Override
	public String toString() 
	{
		return "Physical Product:\r\n"
				+ super.toString()+"\r\n"
				+ "Shipping Weight: "+this.shippingWeight+" kg";
	}	
}


public class ProductStore
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Product Type:\r\n"
				+ "1. Digital Product\r\n"
				+ "2. Physical Product");
		int choice = Integer.parseInt(sc.nextLine());
				
		switch(choice)
		{
			case 1->
			{
					System.out.print("Enter Digital Product Name :");
				    String pName = sc.nextLine();
				
				    System.out.print("Enter Product Price :");
					double pPrice = Double.parseDouble(sc.nextLine());
				
					System.out.print("Enter Product Category :");
					String pcategory = sc.nextLine();
				    
					System.out.print("Enter Product License Key :");
					String licensekey = sc.nextLine();
					
					Product digital = new DigitalProduct(pName, pPrice, pcategory, licensekey);
					System.out.println("Enter the discount % on final bill");
					int discount = Integer.parseInt(sc.nextLine());
					
					System.out.println(digital);
					digital.appplyDiscount(discount);
					System.out.println("Tax RS : "+digital.calculateTax());
			}
			
			case 2->
			{
					System.out.print("Enter Physical Product Name :");
					String pName = sc.nextLine();
				
					System.out.print("Enter Product Price :");
					double pPrice = Double.parseDouble(sc.nextLine());
				
					System.out.print("Enter Product Category :");
					String pcategory = sc.nextLine();
					
				    System.out.print("Enter Product weight :");
				    double weight = Double.parseDouble(sc.nextLine());
				    
				    Product physical = new PhysicalProduct(pName, pPrice, pcategory, weight);
				    PhysicalProduct p = (PhysicalProduct) physical;
				    
				    System.out.println("Enter the discount % on final bill");
				    int discount = Integer.parseInt(sc.nextLine());
				    
				    System.out.println(physical);
				    physical.appplyDiscount(discount);
				    System.out.println("Tax RS :"+physical.calculateTax());
				    System.out.println("Shipping Cost RS :"+ p.calculateShippingCost());
				    
			}
		}

	}

}
