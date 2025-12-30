package com.chirag.abstract_method;
//First Program
abstract class Cake
{
	protected String message;
	
	Cake(String message)
	{
		this.message=message;
	}
	
	abstract void prepareCake();
	
	void displayMessage()
	{
		System.out.println("Meassge on Cake: "+message);
	}
}


class ChocolateCake extends Cake
{

	ChocolateCake(String message) 
	{
		super(message);	
	}
	
	@Override
	void prepareCake()
	{
		System.out.println("Preparing a Chocolate Birthday Cake ....");
		System.out.println("Mixing cocoa Powder , Flour, Butter...");
		System.out.println("Baking the Cake at 180...");
		System.out.println("Decorating with choclate forsting...");
	}
	
}


class VanillaCake extends Cake {

    VanillaCake(String message) 
    {
        super(message);
    }

    @Override
    void prepareCake()
    {
        System.out.println("Preparing a Vanilla Birthday Cake...");
        System.out.println("Mixing vanilla essence, milk, cream...");
        System.out.println("Baking the cake at 170°C...");
        System.out.println("Decorating with fresh cream and sprinkles!");
    }
}


public class abstractDemo1 
{

	public static void main(String[] args)
	{
		Cake c1 = new ChocolateCake("happy birthday chirag");
		Cake c2 = new VanillaCake("happppppyyyy   ");
		
		System.out.println("chocolate cake");
        c1.prepareCake();
        c1.displayMessage();
        System.out.println("----------------------------");
        System.out.println("vanilla cake");
        c2.prepareCake();
        c2.displayMessage();
	}

}
