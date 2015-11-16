package com.main.loops;

/*
* Write a program to check if a given number is Prime or Not!
*/

public class IsPrime {
	
	
	public static boolean isPrime(long num)
	{ 	
		if (num <= 0 )
				return false;
		
		//checking for i < num/2 because mathematically you cannot have a 
		// number n that is divisible by a number greater than n/2
		for(int i = 2; i < num/2; i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
		
		//Input your number to check if Prime or Not!
		if(isPrime(121))
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
	

}
