package com.chirag.arrays_basics_programming;

public class AddFirstAndLastEleOfArray 
{
	public static void main(String[] args) 
	{
		int size = Integer.parseInt(IO.readln("Enter Array Size: "));
        int arr[] = new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
        	arr[i] = Integer.parseInt(IO.readln("Enter Elements at Index "+i+" : "));
        }
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
        	sum = arr[0]+arr[size-1];break;
        }
        IO.print("Sum of  last and first element of a given array : "+sum);
	}
}
/*
Que 3 :
=======
Write a java program to add the last and first element of a given array.

Input as: [1,2,3,4,5,6]   
Output as: 7
*/