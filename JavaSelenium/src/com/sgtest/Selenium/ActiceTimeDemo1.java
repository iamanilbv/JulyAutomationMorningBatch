package com.sgtest.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiceTimeDemo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:82/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login Successful");
		driver.close();
		System.out.println("Application closed successfully");
		
		

	}

}
