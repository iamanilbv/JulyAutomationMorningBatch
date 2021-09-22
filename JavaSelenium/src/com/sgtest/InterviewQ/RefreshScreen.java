package com.sgtest.InterviewQ;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshScreen {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Java Programming"+Keys.ENTER);
		
		
		//1. Refresh method
		
		//driver.navigate().refresh();
		
		//2. Get current URL
		
		//driver.get(driver.getCurrentUrl());
		
		//3. Java script executor
		
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("location.reload()");
		//executor.executeScript("history.go(0)");
		
		//4. Robot class
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
		
		
		
		
		 
		

	}

}
