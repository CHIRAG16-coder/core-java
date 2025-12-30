package com.nit.oop;

public class Dog_BLC {
	String name;
	int age;
	double height;
	
	public void getDogInformation()
	{	
		System.out.println("--------Dog Info-----------");
		System.out.println("Name of the Dog   : "+name);
		System.out.println("Age of the Dog    : "+age);
		System.out.println("Height of the Dog : "+height);
		System.out.println("---------Behavior----------");
	}
	public void bark()
	{
		System.out.println("high intelligence, loyalty, and strong protective instincts");
	}
}
