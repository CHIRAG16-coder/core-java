package com.nit.oop;

import java.util.Scanner;

public class Car_Elc {

	public static void main(String[] args) {
		Car_Blc c = new Car_Blc();
		
		// Initializing the objects properties (NSf) through object reference

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter of the Company");
		c.name = sc.nextLine();
		System.out.println("Enter of the Model");
		c.model = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Color of the Car");
		c.color = sc.nextLine();

		// calling the behavior
		c.getCarInformation();
		System.out.println("Run / Stop");
		String str = sc.next(); 
		c.drive(str);
	//	fa.switchOff();

	}

}
