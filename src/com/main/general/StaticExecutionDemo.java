package com.main.general;

/*
 *  Write a program that contains a constructor, a static block and a static method. 
 *  Execute the program in order to verify the order of execution of methods and block.
 *  @author: Manjula Acharya
 */


public class StaticExecutionDemo {
	
	private static int testCode;
	private static String testString;
	
	
	StaticExecutionDemo(int testCode, String testString)
	{
		StaticExecutionDemo.testCode = testCode;
		StaticExecutionDemo.testString = testString;
		System.out.println("In constructor now, and static variables initialised.");
	}
	
	
	static {
		System.out.println("In static block one.");
		setTestValue(301, "Test 301");
	}
	
	
	static {
		System.out.println("In static block two");
		System.out.println("Static variable values:" + getTestValues());
	}
	
	
	
	private static void setTestValue(int testCode, String testString)
	{
		StaticExecutionDemo.testCode = testCode;
		StaticExecutionDemo.testString = testString;
	}
	
	
	public static String getTestValues()
	{
		String str = null;
		str = testCode + " " +  testString;
		return str;
	}
	
	
	public static void main(String[] args) {
		
		//Call constructor
		new StaticExecutionDemo(101, "Test 101");
		
		System.out.println(getTestValues());
		
		setTestValue(280, "Test 280");
		
		System.out.println(getTestValues());

	}

}
