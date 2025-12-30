package com.chirag.lambda_expression_supplier;

import java.util.function.Supplier;

import java.util.Random;

public class PasswordGenerator 
{
	public static void main(String[] args) 
	{
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String special = "@#$%!&*";
		String combine = (upper+lower+digits+special);
		
		// GENERATING PASSWORD BY USING RANDOM CLASS  
//		Supplier<String> passwordSupplier = ()->
//		{
//			Random random = new Random();
//			StringBuilder builder = new StringBuilder();
//			
//			for(int i=0;i<8;i++)
//			{
//				int randomNumber = random.nextInt(combine.length());
//				builder.append(combine.charAt(randomNumber));
//			}
//			return builder.toString();	
//		};
//		IO.println("Generated Password: "+passwordSupplier.get());
		
		//GENERATING PASSWORD BY USING STRING CLASS  
		Supplier<String> passwordSupplier = ()->
		{
			Random random = new Random();
			String str = "";
			
			for(int i=0;i<8;i++)
			{
				int randomNumber = random.nextInt(combine.length());
				str=str+combine.charAt(randomNumber);
			}
			return str;	
		};
		IO.println("Generated Password: "+passwordSupplier.get());
		
		
	}
}
