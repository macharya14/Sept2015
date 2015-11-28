package com.main.loops;
/*
* Write a program  to calculate factorial of a given number. 
* You need to compute the factorial with one logic that uses 
* recursion and another logic without recursion.
* 
* @author: Manjula Acharya
*/

public class Factorial {
	
	/*
	* Function to calculate factorial using Iteration (Non -recursion)
	*/
	public static int getFactorialIter(int n)
	{
		int factorial = 1;
		if(n == 0)
			return factorial;
		
		for(int i = n; i > 0; i--)
		{
			factorial = factorial * i;
		}
		return factorial;
	}
	
	
	/*
	* Function to calculate factorial using recursion
	*/
	public static int getFactorialRecurs(int n)
	{
		if(n == 0)
			return 1;
		return ((n) * getFactorialRecurs(n - 1));
	}
	

	public static void main(String[] args) {
		
		//Using Recursion
		System.out.println(getFactorialRecurs(10));
		
		//Using Iteration
		System.out.println(getFactorialIter(10));

	}

}
