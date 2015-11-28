package com.test.arrays;

import org.testng.Assert;


import org.testng.annotations.Test;

import com.main.arrays.LargestNumber;
import com.main.arrays.MissingNumber;

/*
 * This class contains all the test cases for testing MissingNumber class 
 * @author: Manjula Acharya
 */

public class TestMissingNumber {
	
	@Test
	public void testPositiveNumbers()
	{
		int[] arr = {2,3,4,6,7};
		int actual = MissingNumber.findMissingNumber(arr);
		Assert.assertEquals(actual, 5);
	}
	
	
	@Test
	public void testNegativeNumbers()
	{
		int[] arr = {-7,-6,-5,-3,-2,-1};
		int actual = MissingNumber.findMissingNumber(arr);
		Assert.assertEquals(actual, -4);
	}
	

}
