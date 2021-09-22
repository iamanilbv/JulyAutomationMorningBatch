package com.sgtest.HardAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertSameDemo {
	
	@Test(enabled=false)
	public void assertSameTesting()
	{
		String s="JavScript";
		String s1="JavScript";
		Assert.assertSame(s, s1);
		System.out.println("The assertSame method has executed successfully");
	}

	@Test
	public void assertNotSameTesting()
	{
		String s="JavScript";
		String s1="javascript";
		Assert.assertNotSame(s, s1);
		System.out.println("The assertNotSame method has executed successfully");
	}
}
