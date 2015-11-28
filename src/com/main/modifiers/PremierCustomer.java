package com.main.modifiers;

/*
 * Extension of ----
* Write a program that implements various functions of different type of access modifiers
* (private, protected, default,public) and then access these methods 
* within or outside the class based on the identifier scope.
* 
* @author: Manjula Acharya
*/

public class PremierCustomer extends Customer{
	
	private int discountCode;

	public void setDiscountCode(int discountCode)
	{
		this.discountCode = discountCode;
	}
	
	public String getPrivileges()
	{
		return (super.getCustomerInfo() + discountCode); 
	}
}