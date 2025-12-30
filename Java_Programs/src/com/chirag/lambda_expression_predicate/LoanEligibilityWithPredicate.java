package com.chirag.lambda_expression_predicate;

import java.util.function.Predicate;

record Customer(String name, Double salary, Integer creditScore, Integer age)
{
	public boolean checkLoanEligibility()
	{
		Predicate<Customer> isEligible = cust ->
		{
			return (cust.salary()>25000) && (cust.creditScore()> 700) && (cust.age()>21); 
		};
		
		return isEligible.test(this);
	}
}
public class LoanEligibilityWithPredicate 
{
	public static void main(String[] args) 
	{
		String name = IO.readln("Enter Customer Name: ");
		Double salary = Double.parseDouble(IO.readln("Enter Salary: "));
		Integer creditScore = Integer.parseInt(IO.readln("Enter Credit Score: "));
		Integer age = Integer.parseInt(IO.readln("Enter Age: "));
		
		Customer cust = new Customer(name, salary, creditScore, age);
		if(cust.checkLoanEligibility())
		{
			IO.println(name+" is Eligible for Loan...");
		}
		else
		{
			System.err.println(name+" is NOT Eligible for Loan...");
		}	
	}
}
