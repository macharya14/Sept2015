package com.main.strings;

/*
* Write a program which accepts a string like "This is nice" and 
* converts it to a string like "This1 is2 nice3".
* 
* @author: Manjula Acharya
*/


public class ModifyString {
	
	public static String splitAndAppend(String inStr)
	{
		String outStr = "";
		
		try
		{
			//Split on one or more white spaces
			String[] splitStr = inStr.split("\\s++");
			int len = splitStr.length;
			
			for(int i = 0; i < len; i++)
			{
				if (i < len-1)
					outStr = outStr + splitStr[i] + (i+1) + " ";
				else
					outStr = outStr + splitStr[i] + (i+1);
			}
		}
		catch(Exception e)
		{
				e.printStackTrace();
		}
		return outStr;
	}
	

	public static void main(String[] args) {
		
		String inputStr = "Humpty Dumpty sat on a wall!";
		System.out.println(splitAndAppend(inputStr));
		
	}
}
