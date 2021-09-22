package com.sgtest.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static WebDriver driver = null;
	public static void main(String[] args) {
		
		launchBorwser();
		navigate();
		login();
		
		
	}
		static void launchBorwser()
		{
			try {
				System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
				driver=new ChromeDriver();
				System.out.println("Borwser launched successfully");
				Thread.sleep(3000);					
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void navigate()
		{
			try {
				driver.get("http://localhost:82/login.do");
				Thread.sleep(3000);		
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void login()
		{
			try {
				driver.findElement(By.xpath("//table[@class='textFieldsTable']/tbody/tr/td/input")).sendKeys("admin");
				driver.findElement(By.xpath("//table[@class='textFieldsTable']/tbody/tr[2]/td/input")).sendKeys("manager");
				driver.findElement(By.xpath("//*[@*='loginButton']")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
}