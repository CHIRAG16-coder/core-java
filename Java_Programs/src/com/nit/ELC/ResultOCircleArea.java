package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.CalculateCircleArea;

public class ResultOCircleArea {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		double area = Double.parseDouble(sc.nextLine());
		System.out.println("Total Area of Circle"+CalculateCircleArea.getArea(area));
		sc.close();
	}

}
