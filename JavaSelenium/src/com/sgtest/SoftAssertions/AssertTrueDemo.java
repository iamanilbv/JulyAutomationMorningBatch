package com.sgtest.SoftAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTrueDemo {
	SoftAssert softassert=new SoftAssert();
	@Test(enabled=false)
	public void verifyCondition1()
	{
		String s="Programming";
		softassert.assertTrue(s.endsWith("ing"));
		System.out.println("The assertTrue method has executed successfully");
	}
	
	@Test
	public void verifyCondition2()
	{
		String s="Programming";
		softassert.assertFalse(s.endsWith("Pro"));
		System.out.println("The assertFalse method has executed successfully");
	}

}
