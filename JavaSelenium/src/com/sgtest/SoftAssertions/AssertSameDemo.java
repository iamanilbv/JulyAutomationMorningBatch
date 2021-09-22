package com.sgtest.SoftAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertSameDemo {
	SoftAssert softassert=new SoftAssert();
	@Test(enabled=false)
	public void assertSameTesting()
	{
		String s="JavScript";
		String s1="JavScript";
		softassert.assertSame(s, s1);
		System.out.println("The assertSame method has executed successfully");
	}

	@Test
	public void assertNotSameTesting()
	{
		String s="JavScript";
		String s1="javascript";
		softassert.assertNotSame(s, s1);
		System.out.println("The assertNotSame method has executed successfully");
	}
}
