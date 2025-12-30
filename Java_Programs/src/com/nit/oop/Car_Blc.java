package com.nit.oop;

public class Car_Blc {
	String name;
	int model;
	String color;
	
	public void getCarInformation()
	{	
		System.out.println("--------Car Info-----------");
		System.out.println("Name of the Company : "+name);
		System.out.println("Name of the Model   : "+model);
		System.out.println("Color of the Car    : "+color);
		System.out.println("---------Behavior----------");
	}
	public void drive(String dr)
	{
		if(dr.equals("Stop"))
		{
		System.out.println("car is Stop");
		}
		else if(dr.equals("Run"))
		{
		System.out.println("Car is running");
		}
		else
		{
		System.out.println("Invalid Input");
		}
	}
}
