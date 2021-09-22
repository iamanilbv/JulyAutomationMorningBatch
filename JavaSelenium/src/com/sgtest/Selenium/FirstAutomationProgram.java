package com.sgtest.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com");
		
		driver.findElement(By.name("username")).sendKeys("anilinfo_bv");
		driver.findElement(By.name("signin")).click();
		//driver.findElement(By.id("login-passwd")).sendKeys("$1Letmei");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/form/div[2]")).sendKeys("test123");
		
		//WebElement val=driver.findElement(By.cssSelector(".password"));
		//val.sendKeys("test");
		
		
		
		//driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("test");
		//driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		
	}

}
