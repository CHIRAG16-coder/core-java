package com.test.blc;

class Alpha
{
	public Alpha()
	{
		System.out.println("No Argumnnet constructor of Alpha class");
	}
	
	public Alpha(int x)
	{
		this();
		System.out.println("parameteried cinstrutor of aplha "+x);
	}
}

class Beta extends Alpha
{
	public Beta() 
	{
		super(10);
		System.out.println("no Arugment constructior of beta class");
	}
	
	
}

public class ConstructorChainingDemo1 {

	public static void main(String[] args) 
	{
		Beta b = new Beta();
		

	}

}
