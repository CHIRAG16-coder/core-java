package com.nit.oop;

import java.util.Scanner;

public class Dog_ELC {

	public static void main(String[] args) {

		Dog_BLC d = new Dog_BLC();
		// Initializing the objects properties (NSf) through object reference

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		d.name = sc.nextLine();
		System.out.println("Enter the Age");
		d.age = sc.nextInt();
		System.out.println("Enter the Height");
		d.height = sc.nextDouble();

		// calling the behavior
		d.getDogInformation();
		d.bark();
	}

}
