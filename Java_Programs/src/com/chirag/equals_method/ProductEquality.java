/*
 * ------------
Create an application to compare two objects based on the content by overriding the equals(Object obj) method of Object class.

Create a BLC class called Product

Instance variables :
private int productId
private String productName

Create a parameterized constructor to initialize all properties.

Override equals(Object obj) method from Object class to compare the content of Product object, Make sure that if end user try to compare the content of two different objects (Product and Employee) then program should provide proper message.

Create an ELC class ProductEquality to test your application by creating two objects of Product class to compare the content by calling Product class overridden equals(Object obj) method.

Follow the equals() and hashCode() contract.
 */
package com.chirag.equals_method;

class Product
{
	private int productId;
	private String productName;
	
	public Product(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public int hashCode() 
	{
		return this.productId;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Product)
		{
			Product product = (Product) obj;
			if(this.productId==product.productId && this.productName.equals(productName))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			IO.println("Object are not comparable Object...");
			return false;
		}
	}	
}

public class ProductEquality 
{
	public static void main(String[] args) 
	{
		Product product = new Product(101, "Laptop");
		Product product1 = new Product(101, "Laptop");
		
		IO.println(product==product1);
		
		IO.println(product.equals(product1));
		IO.println(product.hashCode()+" : "+ product1.hashCode());
		
		IO.println("............................................");
		
		Product product2 = new Product(102, "Mobile");
		Customer customer = new Customer(102, "Chirag");
		
		IO.println(product2.equals(customer));
		IO.println(product2.hashCode());
		IO.println(customer.hashCode());
	}
}

class Customer
{
	private int id;
	private String name;
	
	public Customer(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
