package com.chirag.lambda_expression_cusumer;

import java.util.function.Consumer;

public class ValueModifier
{
	public static void modifyValue(int value,Consumer<Integer> consumer)
	{
		consumer.accept(value);
	}

	public static void main(String[] args) 
	{
		 int input = Integer.parseInt(IO.readln("Original value: "));
		 Consumer<Integer> doubleValue = value -> IO.println("After doubling the value: "+(value+value));
		 Consumer<Integer> incrementBy = value -> IO.println("After incrementing the value by 3: "+(value+3));
		 Consumer<Integer> squareValue = value ->
		 {
			 if(value<=0) {
				 System.err.println("Square of a Number cann't Be Negative");
				 System.exit(0);
			 }
			 else
			 { 
				 IO.println("After squaring the value: "+(value*value));
			 }
		 };     
         modifyValue(input, doubleValue);
         modifyValue(input, incrementBy);
         modifyValue(input, squareValue);    
	}
}
