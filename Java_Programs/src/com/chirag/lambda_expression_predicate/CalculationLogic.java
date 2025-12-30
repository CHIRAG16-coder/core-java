package com.chirag.lambda_expression_predicate;

import java.util.function.Predicate;

public class CalculationLogic
{
	public static boolean testPredicate(int num, Predicate<Integer> pred) 
	{
		return pred.test(num);
	}
	
	public static void main(String[] args) 
	{
		int number = Integer.parseInt(IO.readln("For number : "));
		
		
		Predicate<Integer> pred1 =  num -> num%2==0;
//      Method 2
//		{
//			if(num%2==0)return true;
//			else return false;
//		};
		
		boolean isEven = CalculationLogic.testPredicate(number, pred1);
		
		Predicate<Integer> pred2 =  num -> num > 10;
//		Method 2
//		{
//			if(num > 10)return true;
//			else return false;
//		};
		
		boolean isGreaterThanTen = CalculationLogic.testPredicate(number, pred2);
		
		Predicate<Integer> pred3 =  num ->
		{
			int count = 0;
			 for(int i = 1;i<=num;i++)
			 {
				 if(num%i==0)count++;
			 }
			if(count == 2)return true;
			else return false;
		};
		
		boolean isPrime = CalculationLogic.testPredicate(number, pred3);
		
		
		IO.println(number+" is even: "+isEven);
		IO.println(number+" is greater than 10: "+isGreaterThanTen);
		IO.println(number+" is prime: "+isPrime);
		
	}

}
