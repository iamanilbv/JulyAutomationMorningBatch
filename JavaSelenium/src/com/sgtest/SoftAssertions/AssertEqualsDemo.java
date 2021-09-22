package com.sgtest.SoftAssertions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsDemo {
	SoftAssert softassert=new SoftAssert();
	@Test(enabled=false)
	public void assertEqualsTesting()
	{
		String s="Java";
		String s2=new String("Java");
		softassert.assertEquals(s, s2);
		System.out.println("The assertEquls method has executed successfully");
		
	}
	
	@Test
	public void assertNotEqualsTesting()
	{
		String s="JavaNew";
		String s2=new String("Java");
		softassert.assertNotEquals(s, s2);
		System.out.println("The assertNotEquls method has executed successfully");
		
	}

}
