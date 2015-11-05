package com.main.arrays;

/*
* Write a program to find the largest number in a given array.
*/
public class LargestNumber {
	
	public static int findLargestNumber(int[] num)
	{
		int lnum = num[0];
		
		for(int i = 1; i < num.length; i++)
		{
			if(lnum < num[i])
				lnum = num[i];
		}
		return lnum;
	}

	public static void main(String[] args) {
		
		int[] numarr  = {99, 23, 4, 56, 0, 678, -1, 234};
		
		System.out.println("Largest number is: " + findLargestNumber(numarr));
	}

}
