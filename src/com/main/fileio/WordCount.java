package com.main.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/*
* Write a program to count the number of words in a file.
* 
* @author: Manjula Acharya
*/


public class WordCount {
	
	public static int getWordCount(String srcFile) throws IOException
	{
		int wordCount = 0;
		BufferedReader bf = null;
		
		try
		{
			String inputLine;
			
			//Read contents of file
			bf = new BufferedReader(new FileReader(srcFile));
			
			//Read each line
			while((inputLine = bf.readLine()) != null)
			{
				//Replace multiple white spaces with a single space and use it as delimiter
				String[] words = inputLine.replaceAll("\\s++", " ").split(" ");
				wordCount = wordCount + words.length;
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
		return wordCount;
	}
	

	public static void main(String[] args) throws IOException 
	{
		
		String srcFile = "/Users/macharya/Documents/Chilli Paneer.txt";
		
		try
		{
			int count = getWordCount(srcFile);
			System.out.println("Word count for file: " + srcFile + " is " + count);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
