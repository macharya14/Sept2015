package com.main.strings;

/*
 * Write a program to check for a palindrome string.
 * A palindrome is a word, phrase, number or other sequence of units 
 * that has the property of reading the same in either direction.
 * examples:
 * "Was it a car or a cat I saw"
 * "A Santa at NASA"
 * 
 * @author: Manjula Acharya
 */

public class Palindrome {
	
	public static boolean isPalindrome(String inStr)
	{
		boolean isPalindrome = true;
		
		// Convert string to lower case and 
		// strip all white spaces and any special characters
		String outStr = inStr.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		
		int len = outStr.length();
		int i = 0;
		int j = len - 1;
		while( i < j)
		{
			if(outStr.charAt(i++) != outStr.charAt(j--))
			{
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
	

	public static void main(String[] args) {
		String inputStr = "Was it a car or a cat I saw";
		if(isPalindrome(inputStr))
			System.out.println("Is Palindrome");
		else
			System.out.println("Is not a Palindrome");

	}

}
