package com.main.exceptions;

/*
* Write a program that is expected to throw a null pointer exception 
* and it turn handles it using try catch and finally.
* 
* @author: Manjula Acharya
*/


public class NullPointerExceptionHandler {
	
	
	public static void handleNullPointerException(String str)
	{
		try
		{
			int length = str.length();
			System.out.println("Length of input string is:" + length);
		}
		catch(NullPointerException e)
		{
			
			System.out.println("In catch block: " + e.toString());
		}
		finally
		{
			System.out.println("In finally block!");
		}
	}
	
	

	public static void main(String[] args) {
		
		String str = null;
		
		handleNullPointerException(str);
	}

}
