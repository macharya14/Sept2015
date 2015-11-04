package com.main.arrays;

public class CommonNumber {
	
	// Write a program to find the common number 
	// in any given two arrays.
	
	public static void findCommonNumber(int[] arr1, int[] arr2)
	{
		
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
					System.out.println(arr1[i]);
				
			}
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr1 = {3, 6, 9, 12, 15, 18, 21};
		int[] arr2 = {2, 4, 6, 8, 10, 12, 14, 16, 18};
		
		
		findCommonNumber(arr1, arr2);
		

	}

}
