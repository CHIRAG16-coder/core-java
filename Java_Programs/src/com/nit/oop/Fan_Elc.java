package com.nit.oop;

import java.util.Scanner;

public class Fan_Elc {

	public static void main(String[] args) {
		Fan_Blc fa = new Fan_Blc();
		
		// Initializing the objects properties (NSf) through object reference

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter of the Company");
				fa.name = sc.nextLine();
				System.out.println("Enter of the Coil");
				fa.coil = sc.nextLine();
				System.out.println("Enter the No. of Wings");
				fa.wings = sc.nextInt();

				// calling the behavior
				fa.getFanInformation();
				System.out.println("On / OFF");
				String str = sc.next(); 
				fa.switchOn(str);
			//	fa.switchOff();
	}

}
