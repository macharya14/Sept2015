package com.main.arrays;

/*
* Write a program to perform a linear search on any given array.
* Linear search is the basic search where you look for the element 
* to be searched in a sequential way.
* 
* @author: Manjula Acharya
*/

public class LinearSearch {
	
	public static void findElement(String str, String[] arr)
	{
		boolean found = false;
		for(String s : arr)
		{
			if(s.equals(str))
			{
				System.out.println("Search String found: " + str);
				found = true;
				break;
			}
		}
		if(!found)
			System.out.println("Search String not found.");
	}
	
	
	public static void main(String[] args)
	{
		String[] inputArray = {"Maya", "Anusha", "Manjula", "Pallavi", "Roshni"};
		
		//Searches for a certain String in a String Array
		findElement("Manjula", inputArray);
	}

}
