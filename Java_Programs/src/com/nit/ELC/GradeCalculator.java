package com.nit.ELC;

import java.util.Scanner;


import com.nit.BLCELC.Student;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the marks : ");
		double marks=Double.parseDouble(sc.nextLine());
		System.out.println("Grade of Students : "+Student.calculateGrade(marks));
		sc.close();
	}

}
