package com.main;

public class Stringfuncs {
	
	// Functions to differentiate String (immutable) and 
	// Stringbuffer (mutable)
	
	public static void stringBufferAppend()
	{
		StringBuffer buff = new StringBuffer("My ");
		buff.append("World");
		System.out.println(buff);//StringBuffer is mutable
		
	}
	
	public static void stringConcat()
	{
		String s = new String("My ");
		s.concat("world");
		System.out.println(s);//String is immutable
		
		String scat = s.concat("world");//Create a new String object
		System.out.println(scat);
		
	}
	
	
	

	public static void main(String[] args) {
		
		stringBufferAppend();
		stringConcat();
	}

}
