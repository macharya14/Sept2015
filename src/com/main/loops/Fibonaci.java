package com.main.loops;

/*
* Write a program that prints a fibonaci series that is a sequence of numbers 
* like 0 1 1 2 3 5 8.(The succeeding number is the sum of the preceeding two numbers)
* You can vary the number of elements to be printed meaning 
* you can print 10 numbers or 15 or 20 or any desired number.
*/

public class Fibonaci {
	
	public static void getFibonaci(int n)
	{
		
		if(n < 1)
		{
			System.out.println("Enter a number greater than 0");
			return;
		}
		
		int fibonaci = 0;
		int fib1 = 1;
		int fib2;
		
		for(int i = 1; i <= n; i++)
		{
			System.out.println(fibonaci);
			fib2 = fib1 + fibonaci;
			fibonaci = fib1;
			fib1 = fib2;
		}
	}

	public static void main(String[] args) {
		
		//Input number of elements in the sequence to be printed
		getFibonaci(8);
	}

}
