package com.sgtest.Assignment_30thAug;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenarioAssignment1 {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		loginAdminUser();
		minimizeFlyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logoutAdminUser();
		loginUser1();
		logoutUser1();
		loginUser2();
		logoutUser2();
		loginUser3();
		logoutUser3();
		loginAdminUser();
		modifyPswdForUser123();
		logoutAdminUser();
		loginModifiedPswdUser1();
		logoutUser1();
		loginModifiedPswdUser2();
		logoutUser2();
		loginModifiedPswdUser3();
		logoutUser3();
		loginAdminUser();
		deleteUser123();
		logoutAdminUser();
		closeApplication();
	
		
		//deleteUser1();
		//logout();
		
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
	
	static void loginAdminUser()
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			System.out.println("Logged in with Admin User to Active Time successfully");
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
			Thread.sleep(4000);
			System.out.println("User1 created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser2()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			driver.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User2");
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Last Name");
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("User2.Lastname@gmail.com");
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User2");
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome123");
			driver.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			System.out.println("User2 created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser3()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			driver.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("User3");
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Last Name");
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys("User3.Lastname@gmail.com");
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User3");
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Welcome123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Welcome123");
			driver.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			System.out.println("User3 created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginUser1()
	{
		try {
			driver.findElement(By.id("username")).sendKeys("User1");
			driver.findElement(By.name("pwd")).sendKeys("Welcome123");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(8000);
			if(driver.findElement(By.xpath("//*[@id='welcomeScreenBoxId']/div[3]/div/span[1]"))!=null)
			{
				driver.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
				System.out.println("User1 Logged in to Active Time successfully");
			}else
			{
				System.out.println("User1 Logged in to Active Time successfully without pop-up");
			}			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logoutUser1()
	{
		try {
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("User1 logged out successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginUser2()
	{
		try {
			driver.findElement(By.id("username")).sendKeys("User2");
			driver.findElement(By.name("pwd")).sendKeys("Welcome123");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			System.out.println("User2 Logged in to Active Time successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logoutUser2()
	{
		try {
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("User2 logged out successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginUser3()
	{
		try {
			driver.findElement(By.id("username")).sendKeys("User3");
			driver.findElement(By.name("pwd")).sendKeys("Welcome123");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
			System.out.println("User3 Logged in to Active Time successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logoutUser3()
	{
		try {
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("User3 logged out successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logoutAdminUser()
	{
		try {
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println("Admin user logged out successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Updating the password for User1,2 and 3
	static void modifyPswdForUser123()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Testing123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Testing123");
			driver.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			System.out.println("User1 Password updated successfully");
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Testing123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Testing123");
			driver.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			System.out.println("User2 Password updated successfully");
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Testing123");
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Testing123");
			driver.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			System.out.println("User3 Password updated successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginModifiedPswdUser1()
	{
		try {
			driver.findElement(By.id("username")).sendKeys("User1");
			driver.findElement(By.name("pwd")).sendKeys("Testing123");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			System.out.println("Logged in with Password Modified User1 to Active Time successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginModifiedPswdUser2()
	{
		try {
			driver.findElement(By.id("username")).sendKeys("User2");
			driver.findElement(By.name("pwd")).sendKeys("Testing123");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			System.out.println("Logged in with Password Modified User2 to Active Time successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void loginModifiedPswdUser3()
	{
		try {
			driver.findElement(By.id("username")).sendKeys("User3");
			driver.findElement(By.name("pwd")).sendKeys("Testing123");
			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			System.out.println("Logged in with Password Modified User3 to Active Time successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser123()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj = driver.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			System.out.println("User1 deleted successfully");
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj1 = driver.switchTo().alert();
			obj1.accept();
			Thread.sleep(2000);
			System.out.println("User2 deleted successfully");
			driver.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj2 = driver.switchTo().alert();
			obj2.accept();
			Thread.sleep(2000);
			System.out.println("User3 deleted successfully");
			
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
