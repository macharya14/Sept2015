package com.main.arrays;

/*
* Write a program to find the missing number 
* in a series of sorted numbers stored in an array.
*/

public class MissingNumber {
	
	
	public static void findMissingNumber(int[] num)
	{
		int n = num[0];
		
		for (int i = 1; i < num.length; i++)
		{
			if ((n+1) == num[i])
					n = num[i];
			else
			{
				System.out.println("Missing number is: " + (n+1));
				return;
			}
		}
		
	}

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 4, 5, 7, 8};
		
		findMissingNumber(arr);
	}

}
