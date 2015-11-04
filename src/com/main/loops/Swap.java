package com.main.loops;

// Write a program that swaps 2 given numbers. 
// You need to have 2 separate functions in the program.
 //--> One Function should swap the numbers without any third 
 // new variable.
//--> Second function should swap the numbers using a third variable.

public class Swap {
	
	public static void swapWith2(int x, int y)
	{
		System.out.println("Before swapping: x = " + x + " y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping: x = " + x + " y = " + y);
		
	}
	
	public static void swapWith3(int x, int y)
	{
		System.out.println("Before swapping: x = " + x + " y = " + y);
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("After swapping: x = " + x + " y = " + y);
		
		
	}

	public static void main(String[] args) {
		
		swapWith2(3, 9);
		swapWith3(5, 12);

	}

}
