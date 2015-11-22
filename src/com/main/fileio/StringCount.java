package com.main.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*
* Write a program to search for a string in a file and 
* then return the count of number of occurrences of the string.
*/

public class StringCount {
	
	
	public static int getStringCount(String srcFile, String searchStr) throws IOException
	{
		int stringCount = 0;
		BufferedReader bf = null;
		
		try
		{
			String inLine = null;
			bf = new BufferedReader(new FileReader(srcFile));
			
			while((inLine = bf.readLine()) != null)
			{
				//Do a pattern search using Java Regex
				Pattern r = Pattern.compile(searchStr, Pattern.CASE_INSENSITIVE);
		        Matcher m = r.matcher(inLine);
		        if (m.find())
		        	stringCount++;
		    }
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(bf != null)
				bf.close();
		}
		return stringCount;
	}

	public static void main(String[] args) throws IOException 
	{
		String srcFile = "/Users/macharya/Documents/Chilli Paneer.txt";
		String searchStr = "Paneer";
	
		int count = getStringCount(srcFile, searchStr);
		
		System.out.println("Number of occurencences of string:" + searchStr + " is: " + count);

	}

}
