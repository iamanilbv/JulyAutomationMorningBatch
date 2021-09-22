package com.sgtest.TestNGActive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActiveTime {
	public static WebDriver driver = null;
	
	@Test(priority=1)
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver=new ChromeDriver();
			Thread.sleep(3000);
			System.out.println("Chrome browser launched successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Test(priority=2)
	public void navigate()
	{
		try
		{
			driver.manage().window().maximize();
			driver.get("http://localhost:82/login.do");
			Thread.sleep(3000);
			System.out.println("Active time URL launched successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
//	@Parameters({"username","password","user"})
	@Test(priority=3,dataProvider="getLoginData")
	public void loginUser(String username, String password, String user)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.xpath("//a[div='Login ']")).click();
			Thread.sleep(5000);
			System.out.println(user+" logged in succssfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			System.out.println("Minimized FlyOutWindow successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
//	@Parameters("user")
	@Test(priority=5,dataProvider="getLogout")
	public void logoutUser(String user)
	{
		try {
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println(user+ " logged out successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	public void closeApplication()
	{
		try
		{
			driver.close();
			Thread.sleep(2000);
			System.out.println("Active time Chrome Broswer closed successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
		
	@DataProvider
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager","Admin"}};
	}
	
	@DataProvider
	public Object[][] getLogout()
	{
		return new Object[][] {{"Admin"}};
	}
	
}
