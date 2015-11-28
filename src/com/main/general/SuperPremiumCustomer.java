package com.main.general;

import com.main.modifiers.Customer;

/* Extension of --
* Write a program that implements various functions of different type of access modifiers
* (private, protected, default,public) and then access these methods 
* within or outside the class based on the identifier scope.
* 
* @author: Manjula Acharya
*/

public class SuperPremiumCustomer extends Customer{
	
	private int superprivilegeCode;
	
	public int getsuperprivilegeCode()
	{
		return superprivilegeCode;
	}
	
	public void setsuperprivilegeCode(int superprivilegeCode)
	{
		this.superprivilegeCode = superprivilegeCode;
	}
	
	//Calling a protected method of the super class
	public String getPrivileges()
	{
		return (super.getCustomerInfo() + superprivilegeCode); 
	}
	
	//Cannot call a default method of superclass
	public void setSuperAccountID(String accountID)
	{
		//super.setAccountID(String accountID);
	}
	 
}
