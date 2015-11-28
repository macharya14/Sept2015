package com.main.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Write a program to search for a string in a file and then 
 * replace it with another string.
 * 
 * @author: Manjula Acharya
 */

public class SearchAndReplace{
	
	public static void doSearchAndReplace(String srcFile, String searchStr, String replaceStr) throws IOException
	{
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		File tmpFile = new File("/Users/macharya/Documents/tmpfile.txt");
		try
		{
			String inLine;
			br = new BufferedReader(new FileReader(srcFile));
			
            // check if file exists, else create the tmp file for writing
            if(tmpFile.exists())
            	tmpFile.delete();
            tmpFile.createNewFile();

			bw = new BufferedWriter(new FileWriter(tmpFile));
			
			while((inLine = br.readLine()) != null)
			{
				Pattern p = Pattern.compile(searchStr, Pattern.CASE_INSENSITIVE);
				Matcher m = p.matcher(inLine);
				String replacedStr = m.replaceAll(replaceStr);
				System.out.println(replacedStr);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(br != null)
				br.close();
			if(bw != null)
				bw.close();
			
		}
		
	}
	
	
	
	public static void main(String[] args) throws IOException
	{
		String srcFile = "/Users/macharya/Documents/Chilli Paneer.txt";
		String searchStr = "paneer";
		String replaceStr = "palak";
		
		try
		{
			doSearchAndReplace(srcFile, searchStr, replaceStr);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
