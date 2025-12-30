package com.chirag.Multilevel_Inheritance;

import java.util.Scanner;

//ELC
public class Student_Fee 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a particular type of Student :");
		System.out.println("1) Hosteller Student :\n"+""
				+ "2) DayScholer Student :");
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		  case 1 ->
		    {
		      System.out.println("You have selected Hosteller!!!");
		      System.out.print("Enter Student Id :");      int id = sc.nextInt();
		      System.out.print("Enter Student Name :");    String name = sc.next();
		      System.out.print("Enter Exam Fees :");       double ExamFee = sc.nextDouble();
		      System.out.print("Enter Hostel Fee :");      double hostelfee = sc.nextDouble();
		      System.out.print("Enter your total Fees :"); double totalFee = sc.nextDouble();
		      System.out.print("Refundabale Amount is :"); double amount = sc.nextDouble();
		      double paid = Hosteller.payFee(amount);
     	      if(paid<=0)
     	      {
     	    	  System.out.println("All Fees are Clear");
     	    	  System.exit(0);
     	      }
     	      else
     	      {
     	    	  System.out.println("Remaining amount to pay is:"+paid);
     	      }
     	      Hosteller hosteller = new Hosteller(id, name, ExamFee, hostelfee);
     	      System.out.println(hostelfee);
     	      

		     }
		    
		  case 2 ->
		  {
			  System.out.println("You have selected Day Scholler!!!");
			  System.out.print("Enter Student Id :");      int id = sc.nextInt();
			  if(id<=0)
			  {
				  System.out.println("ID should be positive.");
				  System.exit(0);
			  }
		      System.out.print("Enter Student Name :");    String name = sc.next();
		      System.out.print("Enter Exam Fees :");       double ExamFee = sc.nextDouble();
		      if(ExamFee<=0)
		      {
		    	  System.out.println("Exam Fee should be Positive.");
		    	  System.exit(0);
		      }
		      System.out.print("Enter Transport Fee :");      double transportfee = sc.nextDouble();
		      System.out.print("Enter your total Fees :"); double totalFee = sc.nextDouble();
		      System.out.print("Refundabale Amount is :"); double amount = sc.nextDouble();
     	      DayScholar dayscholar = new DayScholar(id, name, ExamFee, transportfee);
     	      System.out.println(dayscholar);
     	      double paid = dayscholar.payFee(amount);
     	      if(paid<=0)
     	      {
     	    	  System.out.println("All Fees are Clear");
     	    	  System.exit(0);
     	      }
     	      else
     	      {
     	    	  System.out.println("Remaining amount to pay is:"+paid);
     	      }

		  }
		  
		  default ->
		  {
			  System.out.println("Invalid Choice!!");
		  }
		}

	}

}
//BLC

class student
{
	protected int studentId;
	protected String name;
	protected double examFee;
	
	public student(int studentId,String name,double examFee)
	{
		super();
		this.studentId = studentId;
		this.name=name;
		this.examFee=examFee;
	}	
	
}

class Hosteller extends student
{
	protected double hostelFee;

	public Hosteller(int studentId, String name, double examFee, double hostelFee)
	{
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
	}

	@Override
	public String toString()
	{
		return "Hosteller [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", hostelFee="
				+ hostelFee + "]";
	}
	
	public double payFee(double amount)
	{
		double totalFee = (hostelFee+examFee);
		return totalFee-amount;
		
	}
	
	
	
}

class DayScholar extends student
{
	protected double transportFee;

	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}

	@Override
	public String toString() 
	{
		return "DayScholar [studentId=" + studentId + ", name=" + name + ", examFee=" + examFee + ", transportFee="
				+ transportFee + "]";
	}
    
	public double payFee(double amount)
	{
		double totalFee = (transportFee+examFee);
		return totalFee-amount;
		
	}
    
}



