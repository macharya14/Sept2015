package com.test.loops;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.main.loops.IsPrime;

/*
 * This class contains all the test cases for testing IsPrime class 
 * @author: Manjula Acharya
 */
public class TestPrimeNumber {
	
	
	@DataProvider(name="prime")
	public static Object[][] primeNumbers() 
	{
	      return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {123, false}, {41, true}};
	}
	
	@Test(dataProvider="prime")
	public void testforPrime(int inputNum, boolean expected)
	{
		boolean actual = IsPrime.isPrime(inputNum);
		Assert.assertEquals(actual, expected);
	}

}
