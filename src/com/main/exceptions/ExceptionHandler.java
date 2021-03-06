package com.main.exceptions;

/*
* Write a program containing a function which is expected to throw 
* any kind of exception say NullPointerException or 
* ArithmeticException etc and then handle this function in 
* the parent function which calls this function.
* 
* @author: Manjula Acharya
*/

public class ExceptionHandler {

	public static void throwMyExceptions(Integer a, Integer b) throws FloodDangerException, IllegalArgumentException, ArithmeticException, NullPointerException 
	{
		
		if(a > 40)
			throw new FloodDangerException("Flash Flood alert!");
		
		if(a < 0)
			throw new IllegalArgumentException("Input cannot be negative.");
		
		// Will throw ArithmeticException if b = 0
		System.out.println(a/b); 
		
		// Will throw NullPointerException if b is null
		System.out.println(b.toString()); 
		
	}
	
	
	/*
	* This function handles the exceptions thrown by the function 
	* throwMyExceptions() 
	*/
	public static void handleMyExceptions(Integer a, Integer b)
	{
		try
		{
			throwMyExceptions(a, b);
		}
		catch(IllegalArgumentException e1)
		{
			System.out.println("IllegalArgumentException: "+ e1.toString());
			e1.printStackTrace();
		}
		catch(NullPointerException e2)
		{
			System.out.println("NullPointerException: " + e2.toString());
			e2.printStackTrace();
		}
		catch(ArithmeticException e3)
		{
			System.out.println("ArithmeticException: "+ e3.toString());
			e3.printStackTrace();
		}
		catch(FloodDangerException e4)
		{
			System.out.println("FloodDangerException: " + e4.toString());
			e4.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.toString());
			e.printStackTrace();
		}
		finally
		{
			System.out.println("In Finally block");
		}
	}
	
	

	public static void main(String[] args)
	{
		//Pass different arguments to trigger exceptions
		handleMyExceptions(56, 3);
		
	}

}
