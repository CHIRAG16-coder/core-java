package com.chirag.abstract_method;

import java.util.Scanner;

abstract class Cakes
{
	protected String cakeMessage;
	protected double cakeWeight;
	public static final String BAKERY_NAME = "Chirag_Cake";
	
	Cakes(String cakeMessage, double cakeWeight)
	{
		if(cakeMessage.isBlank())
		{
			System.out.println("Cake message cannot be empty.");
			System.exit(0);
		}
		this.cakeMessage=cakeMessage;
		if(cakeWeight<=0)
		{
			System.out.println("Cake weight must be positive.");
			System.exit(0);
		}
		this.cakeWeight=cakeWeight;
	}
	
	public abstract void prepareCake();
	
	public void displayCakeDetails()
	{
		System.out.println("Cake Message: "+cakeMessage);
		System.out.println("Cake Weight: "+cakeWeight);
		System.out.println("Bakery Name: "+Cakes.BAKERY_NAME);
	}
}

class ChocolateCakes extends Cakes
{
	protected double cocoaPercentage = 45.0;
	
	ChocolateCakes(String cakeMeassge,double cakeWeight)
	{
		super(cakeMeassge,cakeWeight);
	}
	
	public void prepareCake()
	{
		super.displayCakeDetails();
		System.out.println("Preparing Chocolate Cake...\r\n"
				+ "Mixing cocoa powder...\r\n"
				+ "Adding sugar and butter...\r\n"
				+ "Baking at 180°C...\r\n"
				+ "Decorating with chocolate frosting!");
	
	}
}

class VanillaCakes extends Cakes
{
	protected double vanillaEssenceML = 10.0;
	
	VanillaCakes(String cakeMessage , double cakeWeight)
	{
		super(cakeMessage,cakeWeight);
	}
	
	public void prepareCake()
	{
		super.displayCakeDetails();
		System.out.println("Preparing Vanilla Cake...\r\n"
				+ "Mixing vanilla essence...\r\n"
				+ "Adding whipped cream...\r\n"
				+ "Baking at 170°C...\r\n"
				+ "Decorating with sprinkles!");
	}
}

class FruitCake extends Cakes
{
	protected int fruitCount;
	
	FruitCake(String cakeMessage, double cakeWeight, int fruitCount)
	{
		super(cakeMessage,cakeWeight);
		if(fruitCount<=0)
		{
			System.out.println("Fruit count must be positive.");
			System.exit(0);
		}
		this.fruitCount=fruitCount;
	}
	
	public void prepareCake()
	{
		super.displayCakeDetails();
		System.out.println("Preparing Fruit Cake...\r\n"
				+ "Chopping "+fruitCount+" fresh fruits...\r\n"
				+ "Mixing into batter...\r\n"
				+ "Baking at 160°C...\r\n"
				+ "Decorating with cherries and berries!");
	}
}
public class abstractDemo2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the cake you want to prepare:\r\n"
				+ "1) Chocolate Cake\r\n"
				+ "2) Vanilla Cake\r\n"
				+ "3) Fruit Cake");
		System.out.println("Enter option [1/2/3]:");
		int choice = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter Cake Message: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Cake Weight (in Kg): ");
		double weight = Double.parseDouble(sc.nextLine());
		
		
		
		switch(choice)
		{
			case 1->
					{
						Cakes c1 = new ChocolateCakes(name, weight);
						c1.prepareCake();
					}
					
			case 2->
					{
						Cakes c2 = new VanillaCakes(name, weight);
						c2.prepareCake();
					}
					
			case 3->
					{
						System.out.println("Enter number of fruits used: ");
						int fruit = Integer.parseInt(sc.nextLine());
						
						Cakes c3 = new FruitCake(name, weight,fruit);
						c3.prepareCake();
					}
		}
	}

}
