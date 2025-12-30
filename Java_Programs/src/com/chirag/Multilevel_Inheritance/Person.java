package com.chirag.Multilevel_Inheritance;

import java.util.Scanner;

public class Person
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	}

}

class Order
{
	private String orderName;
	private int orderId;
	private double price;
	private String address;
	
	
	public Order(String orderName, int orderId, double price, String address) 
	{
		super();
		this.orderName = orderName;
		this.orderId = orderId;
		this.price = price;
		this.address = address;
	}


	public String getOrderName() {
		return orderName;
	}


	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", orderId=" + orderId + ", price=" + price + ", address=" + address
				+ "]";
	}
	
	
	
	
	
}
