package com.sgtest.Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAxesDemo {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigateTo();
		followingAxesTextFiled();
		followingAxesDropdown();
		precedingCheck();
		following();
		preceding();
		ancestor();
		descendant();
		
	}
	
		static void launchBrowser()
		{
			try{
				System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
				driver=new ChromeDriver();
				System.out.println("Borwser launched successfully");
				Thread.sleep(3000);				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void navigateTo()
		{
			try {
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/Dell/AppData/Local/Temp/Rar$EXa2368.46125/XPathAxes_03_Sept_2021/WebTableHTML.html");
				Thread.sleep(3000);	
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void followingAxesTextFiled()
		{
			try {
				System.out.println("FollowingAxes");
				driver.findElement(By.xpath("//td[contains(text(),'Sachin Tendulkar')]/following::td[4]/input")).sendKeys("25000");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void followingAxesDropdown()
		{
			try {
				System.out.println("FollowingAxes - Dropdown values");
				WebElement oEle = driver.findElement(By.xpath("//td[contains(text(),'Sachin')]/following::td[2]/select"));
				Select val = new Select(oEle);
				val.selectByVisibleText("Bangalore");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void precedingCheck()
		{
			try {
				System.out.println("PrecidingAxes - Dropdown values");
				driver.findElement(By.xpath("//td[contains(text(),'Freedom')]/preceding::td[2]/input")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void following()
		{
			try {
				System.out.println("Following");
				driver.findElement(By.xpath("//*[contains(text(),'Rahul')]/following::tr[2]/td[6]/input")).sendKeys("50000");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void preceding()
		{
			try {
				System.out.println("Preceding");
				driver.findElement(By.xpath("//*[text()='Sachin Tendulkar']/preceding::tr[3]/td[1]/input")).click();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void ancestor()
		{
			try {
				System.out.println("Ancestor");
				String s1 = driver.findElement(By.xpath("//input[@id='edit4']/ancestor::tr/ancestor::table")).getAttribute("id");
				System.out.println(s1);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		static void descendant()
		{
			try {
				System.out.println("Descendant");
				driver.findElement(By.xpath("//table[@id='tbl1']//descendant::tr[3]/td[1]/input")).click();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	

}
