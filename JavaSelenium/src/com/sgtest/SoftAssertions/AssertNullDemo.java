package com.sgtest.SoftAssertions;

import java.io.File;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertNullDemo {
	SoftAssert softassert=new SoftAssert();
	@Test(enabled=false)
	public void verifyNullValue()
	{
		File f=null;
		softassert.assertNull(f);
		System.out.println("The assertNull method has executed successfully");
	}

	@Test
	public void verifyNotNullValue()
	{
		File f=null;
		f=new File("F:\\Demo");
		softassert.assertNotNull(f);
		System.out.println("The assertNotNull method has executed successfully");
	}
}
