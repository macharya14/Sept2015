package com.main.loops;

// Write a program to print "ping" if a number is divisible by 3,
// "pong" if a number is divisible by 5, and 
// "ping pong" if number is divisible by both, else print the number.

public class PingPong {
	
	public static void printPingPong(int n)
	{
		if((n % 3 == 0) && (n % 5 == 0))
			System.out.println("Ping Pong");
		else if(n % 3 == 0)
			System.out.println("Ping");
		else if(n % 5 == 0) 
			System.out.println("Pong");
		else
			System.out.println(n);
	}

	public static void main(String[] args) {
		printPingPong(11);
	}

}
