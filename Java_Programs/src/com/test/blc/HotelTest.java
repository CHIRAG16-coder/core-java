package com.test.blc;

import java.util.Scanner;

import com.nit.BLCELC.Hotel;

public class HotelBookingApp {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer name:");
		String customerName = sc.nextLine();
		
		System.out.println("Enter the Hotel name:");
		String hotelName = sc.nextLine();
		
		System.out.println("Enter the roomRate per days:");
		int roomRate = Integer.parseInt(sc.nextLine());
		
		System.out.println("Enter number of days stay:");
		int dayStay = Integer.parseInt(sc.nextLine());
		
		Hotel h = new Hotel();
		double td = h.calculateDiscountedAmount(roomRate, dayStay);
		double da = Hotel.calculateDiscountedAmount(dayStay, td);
		System.out.println("------------- HOTEL BOOKING SUMMARY ---------- ");
		System.out.println("Customer Name         : "+customerName);
		System.out.println("Hotel Name            : "+hotelName);
		System.out.println("Room Rate (per day)   : ₹"+roomRate);
		System.out.println("Days Stayed           : "+dayStay);
		System.out.println("Total Amount          : ₹"+td);
		System.out.println("Amount after Discount : ₹"+da);
		sc.close();
	}
}
