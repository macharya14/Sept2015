package com.main.strings;


/*
 * Write a program to implement hashCode() and equals() methods.
 */

public class TestHashEquals {
	
	private String data;
	
	TestHashEquals(String data)
	{
		this.data = data;
	}
	
	public boolean equals(Object obj)
	{
		
		if(this == obj)
			return true;
		if((obj == null) || (obj.getClass() != this.getClass()))
		{
			 System.out.println(obj.getClass().getName());
			 System.out.println(this.getClass().getName());
			 return false;
		}
		
		TestHashEquals eqtest = (TestHashEquals)obj;
		return(data == eqtest.data) || (data != null && data.equals(eqtest.data));
	}
		

	
	public int hashCode()
	{
		int hash = 7;
		hash = 31 * hash + (null == data ? 0 : data.hashCode());
		return hash;
	}

	
	
	public static void main(String[] args)
	{
		//String str = "Manjula Acharya";
		TestHashEquals eh = new TestHashEquals("Manjula Acharya");
		TestHashEquals eh1 = new TestHashEquals("Manjula Acharya");
		
		if(eh.equals(eh))
			System.out.println("The strings are equal");
		else
			System.out.println("The strings are not equal");
		
		System.out.println(eh.hashCode());
		
		
	}

}
