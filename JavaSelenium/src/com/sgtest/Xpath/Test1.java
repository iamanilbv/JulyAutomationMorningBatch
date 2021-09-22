package com.sgtest.Xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	
	public static WebDriver driver=null;
	public static void main(String[] args) {

		launchBrowser();
		navigate();
		login();
		//createUser();
		//modifyUser("TestUser1");
		//deleteUser("TestUser1");
		createCompany();


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
		try {
			driver.get("http://enigmatic-meadow-39517.herokuapp.com/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
					
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void login()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'student_email\']")).sendKeys("prabhakargudi@gmail.com");
			driver.findElement(By.xpath("//*[@id=\'student_password\']")).sendKeys("India123");
			driver.findElement(By.xpath("//input[@class='btn btn-secondary']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createUser()
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'nav\']/a[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[2]/a[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("user_first_name")).sendKeys("TestUser1");
			driver.findElement(By.id("user_last_name")).sendKeys("TestLast1");
			driver.findElement(By.id("user_email")).sendKeys("Test1.test@gmail.com");
			driver.findElement(By.id("user_phone_number")).sendKeys("9964579423");
			driver.findElement(By.id("user_address")).sendKeys("RPC Layout, VijayNagar, Bangalore");
			WebElement val = driver.findElement(By.xpath("//*[@id=\'user_state\']"));
			Select obj = new Select(val);
			obj.selectByVisibleText("Karnataka");
			driver.findElement(By.id("user_zipcode")).sendKeys("9964579423");
			driver.findElement(By.xpath("//*[@*='Create User']")).click();
			Thread.sleep(3000);
			System.out.println("User created Successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void modifyUser(String user)
	{
		try {
		//	driver.findElement(By.xpath("//*[text()='Edit']")).click();
			driver.findElement(By.xpath("//*[@id=\'nav\']/a[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//td[contains(text(),'"+user+"')]/following::td[8]")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("user_phone_number")).clear();
			driver.findElement(By.id("user_phone_number")).sendKeys("1234567890");
//			driver.findElement(By.xpath("//*[@name='commit' or @class='btn btn-secondary']")).click();
//			driver.findElement(By.xpath("//input[@*='commit']")).click();
//			driver.findElement(By.xpath("//form[@class='edit_user']/descendant::div[15]/input")).click();
//			driver.findElement(By.xpath("//*[@id=\'edit_user_24589\']/div[8]/input")).click();
//			driver.findElement(By.xpath("//*[@*='/users/24549/edit' or @text()='Edit']")).click();
//			driver.findElement(By.xpath("//*[@*='btn btn-secondary' or text()='Update User']")).click();
//			Thread.sleep(5000);
//			System.out.println("User Modified successfully");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser(String user)
	{
		try {
			driver.findElement(By.xpath("//a[text()='Users']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//td[contains(text(),'"+user+"')]/following::td[9]")).click();
			Thread.sleep(2000);
			Alert obj = driver.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			System.out.println("deleted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createCompany()
	{
		try {
			
			driver.findElement(By.xpath("//*[text()='Companies']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[text()='New Company']")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("company_name")).sendKeys("Telefonica");
			driver.findElement(By.id("company_email")).sendKeys("Tef@gmail.com");
			driver.findElement(By.id("company_phone_number")).sendKeys("1234567890");
			driver.findElement(By.id("company_address")).sendKeys("Mysore, India");
			driver.findElement(By.id("company_address")).sendKeys("RPC Layout");
//			driver.findElement(By.xpath("//*[@*='Create Company']")).click();
//			driver.findElement(By.xpath("//*[@id=\'new_company\']/div[5]/input")).click();
//			driver.findElement(By.xpath("//*[@*='Create Company']")).click();
//			driver.findElement(By.xpath("//*[@id=\"new_company\"]/div[5]")).click();
			System.out.println("Company created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
