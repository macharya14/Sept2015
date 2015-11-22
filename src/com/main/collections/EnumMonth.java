package com.main.collections;

/*
 * Write a program that defines an enum having months of the year and 
 * then prints the value of all the enum elements.
 */

public class EnumMonth {
	
	public enum Month {
		JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), 
		AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);
		
		private int value;
		
		private Month(int value)
		{
			this.value = value;
		}
	};
	
	Month month;
	
	EnumMonth(Month month)
	{
		this.month = month;
	}
	
	public static void printMonthsOfTheYear()
	{
		for(Month month : Month.values())
	        System.out.println("Month:" + month.value + " " + month);
	}

	

	public static void main(String[] args) 
	{
		printMonthsOfTheYear();

	}

}
