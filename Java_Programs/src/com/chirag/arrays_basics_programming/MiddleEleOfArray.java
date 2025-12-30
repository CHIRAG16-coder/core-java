package com.chirag.arrays_basics_programming;

public class MiddleEleOfArray {

	public static void main(String[] args) 
	{
		int size = Integer.parseInt(IO.readln("Enter Array Size: "));
        int arr[] = new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
        	arr[i] = Integer.parseInt(IO.readln("Enter Elements at Index "+i+" : "));
        }
        
        if(size%2==0)
        {
        	IO.println(arr[size/2-1] +" "+ arr[(size/2)]);     	
        }
        else
        {
        	IO.println(arr[size/2]);    	
        }
	}
}
/*
Que 5:
=======
Write a java program to find the middle elements of a given array. 
If array is odd then print only the middle element, if array is even
then print both the middle elements.

Input as : 1 2 3 4 5     
Output is : 3

Input is :1 2 3 4 5 6    
Output is :3 4
*/