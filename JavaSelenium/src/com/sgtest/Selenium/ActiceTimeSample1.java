package com.sgtest.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiceTimeSample1 {
	public static WebDriver driver=null;
	public static void main(String[] args) {
		
		launchBrowser();
		NavigateBrowser();
		closeApplication();
	}

	static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
			driver=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void NavigateBrowser()
	{
		try {
			driver.get("http://localhost:82/login.do");
			Thread.sleep(50000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
		{
		try {
			driver.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}

	

}
