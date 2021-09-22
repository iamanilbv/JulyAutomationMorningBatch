package com.sgtest.TestNGExecutionOrder;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecutionOrder {
	
	@BeforeSuite
	public void beforeSuiteMethod()
	{
		System.out.println("It is @BeforeSuite Annotation Method");
	}
	
	@BeforeTest
	public void beforeTestMethod()
	{
		System.out.println("It is @BeforeTest Annotation Method");
	}
	
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("It is @BeforeClass Annotation Method");
	}
	
	@BeforeMethod
	public void beforeMethodExampleMethod()
	{
		System.out.println("It is @BeforeMethod Annotation Method");
	}
	
	@Test
	public void method1()
	{
		System.out.println("It is testng testcase method1 !!!");
	}
	
	@Test
	public void method2()
	{
		System.out.println("It is testng testcase method2 !!!");
	}
	
	@AfterMethod
	public void afterMethodExampleMethod()
	{
		System.out.println("It is @AfterMethod Annotation Method");
	}
	
	@AfterClass
	public void afterClassMethod()
	{
		System.out.println("It is @AfterClass Annotation Method");
	}
	
	@AfterTest
	public void afterTestMethod()
	{
		System.out.println("It is @AfterTest Annotation Method");
	}
	
	@AfterSuite
	public void afterSuiteMethod()
	{
		System.out.println("It is @AfterSuite Annotation Method");
	}

}

