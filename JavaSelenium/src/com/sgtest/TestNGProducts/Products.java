package com.sgtest.TestNGProducts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Products {
	
	@Test
	public void createProduct()
	{
		System.out.println("The User DemoProduct1 has created Successfully");
	}
	
	@Test
	public void modifyProduct()
	{
		System.out.println("The User DemoProduct1 has modified Successfully");
	}
	
	@Test
	public void deleteProduct()
	{
		System.out.println("The User DemoProduct1 has deleted Successfully");
	}
	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Launch Browser and Navigate the Application URL");
	}

	@AfterClass
	public void cleanUp()
	{
		System.out.println("Logout from the Application and Close The Application");
		System.out.println("++++++++++++++++++++++++++++");
	}
}


