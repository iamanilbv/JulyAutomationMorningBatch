package com.sgtest.POMObjRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pages {
	
	private static WebElement element = null;
	
	public static WebElement login_UserName(WebDriver driver) {
		element = driver.findElement(By.id("username"));
		return element;
	}

	public static WebElement login_Password(WebDriver driver) {
		element = driver.findElement(By.name("pwd"));
		return element;
	}
	
	public static WebElement login_LoginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[text()='Login ']"));
		return element;
	}
	
	
}
