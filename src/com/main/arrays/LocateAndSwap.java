package com.main.arrays;

/* Write a program to locate and swap only 2 elements which are not sorted
 * in a given sorted array. 
 * For example given an array {1,2,5,6,4} locate 5 and 4 and then swap them 
 * as they are not as per sorted order.
 * 
 * @author: Manjula Acharya
 */

public class LocateAndSwap {
	
	public static void locateSwap(int[] arr)
	{
		int[] tmp = new int[2];
		int[] index = new int[2];
		int ind = 0;
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i-1] > arr[i])
			{
				System.out.println("arry:" + arr[i-1] + i);
				tmp[ind++] = arr[i-1];
				index[ind++] = i - 1;
			}
		}
		//swap the two
		arr[index[0]] = tmp[1];
		arr[index[1]] = tmp[0];
		System.out.println("One" + arr[index[0]]);
		System.out.println("Two" + arr[index[1]]);
		System.out.println("Three" + tmp[0]);
		System.out.println("Four" + tmp[1]);
		
		
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) {
		
		int[] inputArr = {1, 3, 5, 9, 8, 6, 10};
		locateSwap(inputArr);

	}

}
