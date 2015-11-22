package com.main.strings;

/* 
 * Write a program to check if a given string of parenthesis has 
 * balanced parenthesis or not.
 * For example a string as "(())" is a valid string 
 * where as strings like ")(" or "(()))" are not valid strings.
 */

public class BalancedParenthesis {
	
	public static boolean isBalancedParenthesis(String inStr)
	{
		boolean isBalanced = true;
		
		String outStr = inStr.replaceAll("[^()]", "");
		int len = outStr.length();
		
		if(len%2 != 0)
			return(isBalanced=false);
		int i = 0;
		int j = len - 1;
		while(i < j)
		{
			if(outStr.charAt(i++) != '(' || outStr.charAt(j--) != ')')
			{
				isBalanced = false;
				break;
			}
		}
		return isBalanced;
	}
	

	public static void main(String[] args) {
		String inputStr = ")(()))";
		
		if(isBalancedParenthesis(inputStr))
			System.out.println("Parenthesis are balanced");
		else
			System.out.println("Parenthesis are not balanced");
	}

}
