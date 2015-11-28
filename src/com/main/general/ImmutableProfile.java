package com.main.general;

/*
 * Write an Immutable class.
 * 
 * @author: Manjula Acharya
 */

public final class ImmutableProfile {
	
	public final String SSNo;
	public final String name;
	
	public ImmutableProfile(String SSNo, String name)
	{
		this.SSNo = SSNo;
		this.name = name;
	}
	
	public String getSSNo()
	{
		return SSNo;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public static void main(String[] args){
		ImmutableProfile p = new ImmutableProfile("6543215678", "Caroline");
		System.out.println(p.getSSNo());
		System.out.println(p.getName());
	}
}


