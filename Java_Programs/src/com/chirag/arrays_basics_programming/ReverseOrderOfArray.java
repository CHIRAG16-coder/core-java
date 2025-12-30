package com.chirag.arrays_basics_programming;

public class ReverseOrderOfArray 
{
	public static void main(String[] args) 
	{
		int size = Integer.parseInt(IO.readln("Enter Array Size: "));
        int arr[] = new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
        	arr[i] = Integer.parseInt(IO.readln("Enter Elements at Index "+i+" : "));
        }
        IO.print("Reverse Array: ");
        for(int i=arr.length-1;i>=0;i--)
        {
        	IO.print(" "+arr[i]);
        }      
	}
}
/**
Que 2:
=======
Print all elements in reverse order of an Array.

Input as: 1 2 3 4 5
Output as: 5 4 3 2 1
*/
