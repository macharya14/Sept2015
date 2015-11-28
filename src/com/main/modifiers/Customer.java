package com.main.modifiers;

/*
* Write a program that implements various functions of different type of access modifiers
* (private, protected, default,public) and then access these methods 
* within or outside the class based on the identifier scope.
* 
* @author: Manjula Acharya
*/

public class Customer{
	
	public String customerName;
	private String accountID;
	
	
	// Private modifier (visible only to class)
	private String getAccountID()
	{
		return (accountID);
	}
	
	//Protected modifier (Visible to class, within package and subclasses(in same or diff package)
	protected String getCustomerInfo()
	{
		return (customerName + ":" + getAccountID());
	}
	
	//Default modifier (Visible to class and package)
	void setAccountID(String accountID)
	{
		this.accountID = accountID;
	}
	
	
	//Public modifier (Visible to all)
	public String getcustomerName()
	{
		return (customerName);
	}
	
	public void setcustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	
	
}
