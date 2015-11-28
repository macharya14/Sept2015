package com.test.loops;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.main.loops.Factorial;

/*
 * This class contains all the test cases for testing Factorial class 
 * @author: Manjula Acharya
 */

public class TestFactorial {
	
	@Test
	@Parameters({"inputNum", "expected"})
	public void testFactorialIter(int inputNum, int expected) {
		int actual = Factorial.getFactorialIter(inputNum);
		Assert.assertEquals(actual, expected);
	}
	
	
	@Test
	@Parameters({"inputNum", "expected"})
	public void testFactorialRecurs(int inputNum, int expected) {
		int actual = Factorial.getFactorialRecurs(inputNum);
		Assert.assertEquals(actual, expected);
	}
}
