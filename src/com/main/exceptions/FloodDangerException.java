package com.main.exceptions;

/*
* This class is used for creating a custom Exception, called by the 
* Exception Handler class
*/

public class FloodDangerException extends Exception{
	
	public FloodDangerException(String message)
	{
		super(message);
	}

}
