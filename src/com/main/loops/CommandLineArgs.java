package com.main.loops;

/*
* Program  that accepts input from the command line and 
* then prints them.
*/

public class CommandLineArgs {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}

	}

}
