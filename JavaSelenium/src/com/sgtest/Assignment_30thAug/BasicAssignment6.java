package com.sgtest.Assignment_30thAug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAssignment6 {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		modifyProject();
		deleteProject();
		deleteCustomer();
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
	
	static void createCustomer()
	{
		try {
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Telefonica");
			driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Telefonica");
			driver.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			Thread.sleep(4000);
			System.out.println("Customer created successfully");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}
	
	static void createProject()
	{
		try {
			driver.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("SMIP");
			driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("SMIP");
			driver.findElement(By.xpath("//*[@id=\'projectPopup_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			System.out.println("Customer Project created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyProject()
	{
		try
		{
			driver.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).clear();
			driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")).sendKeys("Smart Metering Project");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]")).click();
			Thread.sleep(2000);
			System.out.println("Project modified successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteProject()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			System.out.println("Customer Project deleted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer()
	{
		try {
			driver.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			System.out.println("Customer deleted successfully");
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
