package com.main.strings;

/*
* Write a program to reverse a string.
* Do not use StringBuffer/StringBuilder inbuilt reverse function.
*/ 

public class ReverseString {
	
	public static String reverseString(String inStr)
	{
		String outStr = "";
		
		try
		{
			int i = inStr.trim().length() - 1;
			
			while(i >= 0)
			{
				outStr = outStr + inStr.charAt(i);
				i--;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return outStr;
	}
	

	public static void main(String[] args) {
		String input = "My name ia Manjula";
		System.out.println("Reversed string: " + reverseString(input));

	}

}
