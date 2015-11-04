package com.main.loops;


public class IsPrime {
	
	//Check if a given number is Prime or not!
	public static boolean isPrime(long num)
	{ 	
		if (num <= 0 )
				return false;
		
		for(int i = 2; i < num/2; i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
		if(isPrime(121))
			System.out.println("Prime Number");
		else
			System.out.println("Not a Prime Number");
	}
	

}
