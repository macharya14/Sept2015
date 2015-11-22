package com.main.fileio;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
* Write a program that takes input from user dynamically using below 
* *	classes.
*	--> Scanner: Use this class to input 2 integer numbers and sum them.
*	--> BufferedReader and InputStreamReader: Use this classes to input 
*		2 integer numbers and subtract them.
*	--> DataInputStream: Use this class to input 2 integer numbers and 
*		multiply them.
*	--> Console: Use this class to input 2 integer numbers and divide them.
*/


public class DataInput {
	
	private static int n1;
	private static int n2;
	
	public static void useScanner()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		n1 = sc.nextInt();
		System.out.println("Enter second number: ");
		n2 = sc.nextInt();
		System.out.println("n1 + n2 = " + (n1+n2));
	}
	
	
	public static void useBufferedReader() throws IOException
	{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number: ");
		String s1 = bf.readLine();
		n1 = Integer.parseInt(s1);
		
		System.out.println("Enter second number: ");
		String s2 = bf.readLine();
		n2 = Integer.parseInt(s2);
		
		System.out.println("n1 - n2 =  " + (n1 - n2));
		
	}

	
	public static void useDataInputStream() throws IOException
	{
		DataInputStream dis = new DataInputStream(System.in);
		
		System.out.println("Enter first number: ");
		String s1 = dis.readLine();
		n1 = Integer.parseInt(s1);
		
		System.out.println("Enter second number: ");
		String s2 = dis.readLine();
		n2 = Integer.parseInt(s2);
		
		System.out.println("n1 * n2 =  " + (n1 * n2));
	}
	
	
	public static void useConsole()
	{
		Console cnsl = System.console();
		if(cnsl != null)
		{
		
			String s1 = cnsl.readLine("Enter first number:");
			n1 = Integer.parseInt(s1);
		
			String s2 = cnsl.readLine("Enter second number:");
			n2 = Integer.parseInt(s2);
			
			System.out.println("n1 / n2 =  " + (n1 / n2));
		}
		else
		{
			System.out.println("Null console");;
			return;
		}
		
	}

	public static void main(String[] args) throws IOException 
	{
		//Use Scanner class
		useScanner();
		
		//Use BufferedReader and InputStreamReader
		useBufferedReader();
		
		//DataInputSream
		useDataInputStream();
		
		//Console
		useConsole();
	}
}
