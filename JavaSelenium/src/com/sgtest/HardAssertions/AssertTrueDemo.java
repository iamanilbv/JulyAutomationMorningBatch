package com.sgtest.HardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueDemo {
	
	@Test(enabled=false)
	public void verifyCondition1()
	{
		String s="Programming";
		Assert.assertTrue(s.endsWith("ing"));
		System.out.println("The assertTrue method has executed successfully");
	}
	
	@Test
	public void verifyCondition2()
	{
		String s="Programming";
		Assert.assertFalse(s.endsWith("Pro"));
		System.out.println("The assertFalse method has executed successfully");
	}

}
