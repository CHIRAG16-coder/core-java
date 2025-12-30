package com.nit.ELC;

import java.util.Scanner;

import com.nit.BLCELC.Product;

public class ProductDemo {

	public static void main(String[] args) {
		
		Product p = new Product();
		Scanner sc =new Scanner(System.in);
		System.out.println("---------Product Info---------");
		
		System.out.println("Enter the Product id :");
		int pid = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter the Product Name :");
		String pname = sc.nextLine();
		
		System.out.println("Enter the Product Price :");
		double ppr = Double.parseDouble(sc.nextLine());
		
		//calling the function form to BLC
		p.setProductData(pid, pname, ppr);
		p.getProductInfo();
	}

}
