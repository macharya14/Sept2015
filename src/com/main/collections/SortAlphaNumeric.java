package com.main.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Write a program which takes an input series as a1,a2,a3....an,
 * b1,b2,b3...bn and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
 * 
 * @author: Manjula Acharya
 */

public class SortAlphaNumeric implements Comparator<String>{
	
		@Override
		public int compare(String str1, String str2) 
		{
			int n1 = splitAlphaNumeric(str1);
			int n2 = splitAlphaNumeric(str2);
			return (n1 - n2);
		}
		
		//Using Java Regex to retrieve the numeric part of the alphanumeric input
		public static int splitAlphaNumeric(String str)
		{
			int num = 0;
			Pattern p = Pattern.compile("\\d+");
			Matcher m = p.matcher(str);
				
			if(m.find())
			{
				int beginIndex = m.start();
				String digit = str.substring(beginIndex);
				num = Integer.valueOf(digit);
			}
			return num;
		}
		
		public static void printList(List<String> inlist)
		{
			for(String str: inlist)
				System.out.print(" " + str);
		}
		
		
		public static void main(String[] args) {
			String[] inArr = {"a1", "a2", "a3", "a4", "a5", "b1", "b2", "b3", "b4", "b5"};
			List<String> inlist = new ArrayList<String>(Arrays.asList(inArr));
			
			System.out.println("Before sorting:");
			printList(inlist);
			
			Collections.sort(inlist, new SortAlphaNumeric());
			
			System.out.println("\n\nAfter sorting:");
			printList(inlist);
			
		}

	}


	


