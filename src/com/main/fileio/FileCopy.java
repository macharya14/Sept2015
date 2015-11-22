package com.main.fileio;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * Write a program to copy content of a file into another file.
 */


public class FileCopy {
	
	public static void doFileCopy(String srcFile, String destFile) throws IOException
	{
		InputStream in = null;
		OutputStream out = null;
		try
		{
			in = new FileInputStream(new File(srcFile));
			
			out = new FileOutputStream(new File(destFile));
			
			int len;
			
			while ((len = in.read()) > 0) 
			{
				out.write(len);
			}
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(in != null)
				in.close();
			if(out != null)
				out.close();
		}
			
	}
	

	public static void main(String[] args) throws IOException {
		String srcFile = "/Users/macharya/Documents/Dahi Bhindi.txt";
		String destFile = "/Users/macharya/Documents/Bhindi recipes.txt";
		
		try
		{
			doFileCopy(srcFile, destFile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
