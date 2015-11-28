package com.main.arrays;

/*
 * Write a program to merge 2 arrays.
 * 
 * @author: Manjula Acharya
 */

public class Merge {
	
	public static int[] mergeArrays(int[] arr1, int[] arr2)
	{
		int[] arr12 =  new int[arr1.length + arr2.length];
		
		// Copy arrays into the newly allocated array
		for(int i = 0; i < arr1.length; i++)
			arr12[i] = arr1[i];
		for(int j = 0; j < arr2.length; j++)
			arr12[j + arr1.length] = arr2[j];
		
		return arr12;
	}
	

	public static void main(String[] args) {
		
		int arr1[] = { -1, 1, 5, 23, 5, 9};
		int arr2[] = {3, 67, 9, 0, -11, 4};
		
		int arr12[];
		arr12 = mergeArrays(arr1, arr2);
		
		//Sort the array using ArraySort.sortArray() method
		ArraySort.sortArray(arr12);
		
		for(int i = 0; i < arr12.length; i++)
			System.out.println(arr12[i]);

	}

}
