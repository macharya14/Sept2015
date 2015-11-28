package com.main.arrays;

public class ArraySort {
	
	/*
	 * A Simple bubble sort algorithm
	 *  but highly inefficient sorting algorithm O(n^2)
	 *  
	 *  @author: Manjula Acharya
	 */
	
	public static int[] sortArray(int[] arr)
	{
		int tmp = 0;
		int count = 1;
		int len = arr.length;
		
		while(count < len)
		{
			for(int i = 1; i < len; i++ )
			{
				if (arr[i-1] > arr[i])
				{
					tmp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = tmp;
				}
			}
			count++;
		}
		return arr;
	}
	

	public static void main(String[] args) {
		int[] input = {23, 3, 5, 0, 45, 9, 6, 5, 1};
		sortArray(input);
		for(int i = 0; i < input.length; i++)
			System.out.println(input[i]);

	}

}
