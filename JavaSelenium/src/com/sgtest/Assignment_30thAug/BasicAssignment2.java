package com.sgtest.Assignment_30thAug;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAssignment2 {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		modifyUser1();
		deleteUser1();
		logout();
		closeApplication();
	}
	static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Chrome browser launched successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void navigate()
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
	
	static void login()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			System.out.println("Active time logged in successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void minimizeFlyOutWindow()
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
	
	static void createUser1()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			driver.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User1");
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Last Name");
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("User1.Lastname@gmail.com");
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User1");
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome123");
			driver.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(5000);
			System.out.println("User1 created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser1()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Lastname10");
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome123");
			driver.findElement(By.xpath("//*[@id='userDataLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
			System.out.println("User1 modified successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser1()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj = driver.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			System.out.println("User1 deleted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		try
		{
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Active time logged out successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
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
}
