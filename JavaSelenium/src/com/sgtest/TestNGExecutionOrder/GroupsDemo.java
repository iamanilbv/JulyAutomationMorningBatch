package com.sgtest.TestNGExecutionOrder;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test(groups= {"smoke"})
	public void method1()
	{
		System.out.println("It is method1 statement for Smoke Testing");
	}
	
	@Test(groups= {"smoke"})
	public void method2()
	{
		System.out.println("It is method2 statement for Smoke Testing");
	}
	
	@Test(groups= {"regreesion"})
	public void method3()
	{
		System.out.println("It is method3 statement for Regression Testing");
	}
	
	@Test(groups= {"regression"})
	public void method4()
	{
		System.out.println("It is method2 statement for Regression Testing");
	}

}