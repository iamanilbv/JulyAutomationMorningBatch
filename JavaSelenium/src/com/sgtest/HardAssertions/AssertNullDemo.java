package com.sgtest.HardAssertions;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullDemo {
	
	@Test(enabled=false)
	public void verifyNullValue()
	{
		File f=null;
		Assert.assertNull(f);
		System.out.println("The assertNull method has executed successfully");
	}

	@Test
	public void verifyNotNullValue()
	{
		File f=null;
		f=new File("F:\\Demo");
		Assert.assertNotNull(f);
		System.out.println("The assertNotNull method has executed successfully");
	}
}
