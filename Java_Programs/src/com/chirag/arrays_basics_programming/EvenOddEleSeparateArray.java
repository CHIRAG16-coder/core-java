package com.chirag.arrays_basics_programming;

public class EvenOddEleSeparateArray 
{
	public static void main(String[] args) 
	{
		int size = Integer.parseInt(IO.readln("Enter Array Size: "));
        int arr[] = new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
        	arr[i] = Integer.parseInt(IO.readln("Enter Elements at Index "+i+" : "));
        }
        
        IO.print("Even elements are : ");
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]%2==0)
        	{
        		IO.print(" "+arr[i]);
        	}
        }
        IO.println();
        IO.print("Odd elements are : ");

        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]%2==1)
              {
             	IO.print(" "+arr[i]);;
             }
        }          
	}
}

/*
Que 4 :
=======
Write a java program to print all even elements and odd elements 
separately from an array.

Input as  : 1 2 3 4 5 6 7
Even elements are : 2 4 6
Odd elements are : 1 3 5 7
*/