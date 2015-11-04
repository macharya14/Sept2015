package com.main.loops;

// Write a program that prints a fibonaci series that is a sequence of numbers 
// like 0 1 1 2 3 5 8.(The succeeding number is the sum of the preceeding two numbers)
//You can vary the number of elements to be printed meaning 
//you can print 10 numbers or 15 or 20 or any desired number.

public class Fibonaci {
	
	public static void getFibonaci(int n)
	{
		
		if(n < 1)
		{
			System.out.println("Enter a number greater than 0");
			return;
		}
		
		int fib1 = 0;
		int fib2 = 1;
		int fibonaci;
		
		for(int i = 1; i <= n; i++)
		{
			fibonaci = fib1 + fib2;
			System.out.println(fib1);
			fib1 = fib2;
			fib2 = fibonaci;
		}
	}

	public static void main(String[] args) {
		
		//Input is number of elements in the sequence to be printed
		getFibonaci(5);
	}

}
