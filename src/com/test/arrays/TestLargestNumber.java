package com.test.arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.arrays.LargestNumber;

/*
 * This class contains all the test cases for testing LargestNumber class 
 * @author: Manjula Acharya
 */

public class TestLargestNumber {
	
	
		@Test
		public void testPositiveNumbers()
		{
			int[] arr = {2,3,45,34,13};
			int actual = LargestNumber.findLargestNumber(arr);
			Assert.assertEquals(actual, 45);
		}
		
		@Test
		public void testNegativeNumbers()
		{
			int[] arr = {-2,-3,-45,-34,-13};
			int actual = LargestNumber.findLargestNumber(arr);
			Assert.assertEquals(actual, -2);
		}
		
		@Test
		public void testMixedNumbers()
		{
			int[] arr = {-2,3,15,-34,13};
			int actual = LargestNumber.findLargestNumber(arr);
			Assert.assertEquals(actual, 15);
		}
		
		@Test
		public void testDuplicateNumbers()
		{
			int[] arr = {2,3,45,34,45,2};
			int actual = LargestNumber.findLargestNumber(arr);
			Assert.assertEquals(actual, 45);
		}
		
		
		@Test
		public void testWithZeroes()
		{
			int[] arr = {0, 0, 0};
			int actual = LargestNumber.findLargestNumber(arr);
			Assert.assertEquals(actual ,0);
		}

}
