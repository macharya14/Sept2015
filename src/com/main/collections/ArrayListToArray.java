package com.main.collections;

import java.util.ArrayList;

/*
 * Write a program to copy arraylist to an array.
 */

public class ArrayListToArray {
	
	public static String[] copyToArray(ArrayList<String> alist)
	{
		String[] strArr = new String[alist.size()];
		
		int i = 0;
		for(String s: alist)
		{
			strArr[i++] = s;
		}
		return strArr;
	}

	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList();
		String pattern = "item";
		
		//Create an array list of strings item1, item2.....item10
		for(int i = 1; i <= 10; i++)
			alist.add(pattern + i);
		
		String[] sarr = copyToArray(alist);
		
		for(int i = 0; i < sarr.length; i++)
			System.out.println(sarr[i]);
	}

}
