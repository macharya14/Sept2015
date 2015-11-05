package com.main.loops;
/*
* Write a program  that prints a pattern like below, 
* where you can vary the number of rows to be printed
* 	*
* 	**
* 	***
* 	****
* 	*****
* 	******
*/

public class PrintPattern {
	
	public static void printPattern(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		// Input the number of rows to be printed
		printPattern(8);

	}

}
