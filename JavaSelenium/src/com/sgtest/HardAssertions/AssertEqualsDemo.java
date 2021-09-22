package com.sgtest.HardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsDemo {
	
	@Test(enabled=false)
	public void assertEqualsTesting()
	{
		String s="Java";
		String s2=new String("Java");
		Assert.assertEquals(s, s2);
		System.out.println("The assertEquls method has executed successfully");
		
	}
	
	@Test
	public void assertNotEqualsTesting()
	{
		String s="JavaNew";
		String s2=new String("Java");
		Assert.assertNotEquals(s, s2);
		System.out.println("The assertNotEquls method has executed successfully");
		
	}

}
