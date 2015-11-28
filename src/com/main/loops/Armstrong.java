package com.main.loops;

/*
* Write a program  to check an Armstrong number i.e. 
* If we power up each individual number to the total
* number of digits in the number and add them, the sum  should be 
* equal to the number itself. For example 153 has 3 digits in it and 
* if we do 1^3+5^3+3^3=153.
* 
* @author: Manjula Acharya
*/

public class Armstrong {
	
	public static boolean isArmstrong(int n)
	{
		String numStr = Integer.toString(n);
		
		int length = numStr.length();
		double numArmstrong = 0;
		for(int i = 0; i < length; i++)
		{
			String s;
			s = "" + numStr.charAt(i);
			int val = Integer.parseInt(s);
			numArmstrong = numArmstrong + Math.pow(val,  3);
		}
		if (numArmstrong == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		if(isArmstrong(407))
			System.out.println("Armstrong number");
		else
			System.out.println("Not an Armstrong number");

	}
}
