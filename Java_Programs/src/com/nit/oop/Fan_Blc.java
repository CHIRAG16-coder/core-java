package com.nit.oop;

public class Fan_Blc {
	String name;
	String coil;
	int wings;
	
	public void getFanInformation()
	{	
		System.out.println("--------Fan Info-----------");
		System.out.println("Name of the Company : "+name);
		System.out.println("Name of the Coil    : "+coil);
		System.out.println("No.of Wings         : "+wings);
		System.out.println("---------Behavior----------");
	}
	public void switchOn(String s){
	if(s.equals("On"))
	{
		System.out.println("Fan is ON ");
	}
	else if(s.equals("Off"))
	{
		System.out.println("Fan is OFF");
	}
	else
	{
		System.out.println("Invalid Input");
	}
}
}
