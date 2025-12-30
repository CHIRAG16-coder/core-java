
package com.chirag.method_overriding;

import java.util.Scanner;

abstract class Cake 
{
	private String shape;
	private String flavor;
	private int quantity;
	public static double PRICE=400;
	
	public Cake(String shape,String flavor,int quantity)
	{
		this.shape=shape;
		this.flavor=flavor;
		this.quantity=quantity;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() 
	{
		return "A "+this.shape+" "+this.flavor+" Cake Of "+this.quantity+" Kg is Ready @ Rs."+(PRICE*quantity);
	}
		
}

class OrderedCake extends Cake
{

	private String message;
	
	public OrderedCake()
	{
		super("Round","Vanilla",1);
	}

	public OrderedCake(String shape, String flavor, int quantity) 
	{
		super(shape, flavor, quantity);
	}

	public OrderedCake(String shape, String flavor, int quantity, String message) 
	{
		super(shape, flavor, quantity);
		this.message = message;
	}
	
	public String toString()
	{
		if(message.isBlank())
		{
			return super.toString();
		}
		else
		{
		return "A "+super.getShape()+" "+super.getFlavor()+" Cake Of "+super.getQuantity()+" Kg is Ready With "+this.message+" message @ Rs."+(PRICE*super.getQuantity());
	}}
		
}
public class CakeOrder 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-----Hello Welcome To Cake Shop------");
		System.out.println("Enter the Shape of Cake Your Want ??");
		String shape = sc.nextLine();
		
		System.out.println("Enter the flavour of Cake Your Want ??");
		String flavor = sc.nextLine();
		
		System.out.println("Enter the Quantity of Cake Your Want ??");
		int quantity = Integer.parseInt(sc.nextLine());
		
		System.out.println("Do You Want Any Message[Yes/No]");
		String opt = sc.nextLine();
		if(opt.equalsIgnoreCase("Yes")||opt.equalsIgnoreCase("Y"))
		{
			System.out.println("Enter the Meassge of Cake Your Want ??");
			String message = sc.nextLine();
			Cake order = new OrderedCake(shape, flavor, quantity, message);
			System.out.println(order);
			
		}
		else
		{
		Cake order1 = new OrderedCake(shape, flavor, quantity);
		System.out.println(order1);
		}
		
		
	}

}
