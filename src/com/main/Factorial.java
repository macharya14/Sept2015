package com.main;
// Write a program  to calculate factorial of a given number. 
// You need to compute the factorial with one logic that uses 
// recursion and another logic without recursion.

public class Factorial {
	
	public static int FactIterative(int n)
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
	
	public static int FactRecursion(int n)
	{
		if(n == 0)
			return 1;
		return ((n) * FactRecursion(n - 1));
	}

	public static void main(String[] args) {
		System.out.println(FactRecursion(10));
		System.out.println(FactIterative(10));

	}

}
