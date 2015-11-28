package com.main.arrays;

/*
* Write a program to find the missing number 
* in a series of sorted numbers stored in an array.
* 
* @author: Manjula Acharya
*/

public class MissingNumber {
	
	
	public static int findMissingNumber(int[] num)
	{
		int missing = 0;
		int n = num[0];
		
		for (int i = 1; i < num.length; i++)
		{
			if ((n+1) == num[i])
					n = num[i];
			else
			{
				missing = n+1;
				break;
			}
		}
		return missing;
	}
	

	public static void main(String[] args) {
		
		int[] arr = {2, 3, 4, 5, 7, 8};
		
		System.out.println("Missing number is :" + findMissingNumber(arr));
	}

}
