package com.main.loops;

/*
* Write a program to print "Ping" if a number is divisible by 3,
* "Pong" if a number is divisible by 5, and 
* "Ping Pong" if number is divisible by both, else print the number.
* @author: Manjula Acharya
*/

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
		
		//Print 'Ping', 'Pong' or 'Ping Pong' depending on the input
		printPingPong(150);
	}

}
