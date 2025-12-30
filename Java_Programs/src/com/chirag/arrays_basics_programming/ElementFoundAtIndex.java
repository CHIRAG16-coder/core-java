package com.chirag.arrays_basics_programming;

public class ElementFoundAtIndex 
{
	public static void main(String[] args) 
	{
		int size = Integer.parseInt(IO.readln("Enter Array Size: "));
        int arr[] = new int[size];
        
        for(int i=0;i<arr.length;i++)
        {
        	arr[i] = Integer.parseInt(IO.readln("Enter Elements at Index "+i+" : "));
        }
        
        int search = Integer.parseInt(IO.readln("Enter searching element: "));
      
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {		
        	if(arr[i]==search)
        	{
        		IO.print("Element found at index "+i); count++;	
        	}
        }   
        if(search==0) System.err.println("Output: Element not found");   	
	}
}


/**
Que 1 :
========
Search for a given Element in an Array if present then print
"Element found at index : ", if not present print "Element not found"
    
Input as: 1 4 3 5 2 6 5
Enter searching element: 5
Output: Element found at index 3

Input as: 1 4 3 5 2 6
Enter searching element: 7
Output: Element not found
*/