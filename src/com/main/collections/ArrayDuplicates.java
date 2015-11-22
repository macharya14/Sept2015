package com.main.collections;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * * Write a program to find duplicates in an array using set.
 */

public class ArrayDuplicates {
	
	public static void findDuplicates(String[] strArray)
	{
		 
        HashSet<String> set = new HashSet<String>();
 
        for (String str : strArray)
        {
            if(!set.add(str)) //duplicate
            {
                System.out.println("Duplicate element: " + str);
            }
        }
		
	}
	

	public static void main(String[] args) 
	{
		String[] input = {"Jan", "Feb", "Jan", "March", "Dec", "Nov", "Jan", "Feb", "June"};
	
		findDuplicates(input);
	}

}
