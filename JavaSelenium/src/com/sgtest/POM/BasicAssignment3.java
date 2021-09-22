package com.sgtest.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class BasicAssignment3 extends AssignmentAdvancedPOM1 {
	
	public static WebDriver driver = null;
	public static ActiPage oPage=null;	

	public static void main(String[] args) {

		BasicAssignment3 ba3 = new BasicAssignment3();

		ba3.launchBrowser();
		ba3.navigate();
		ba3.loginUser("admin", "manager", "Admin");
		ba3.minimizeFlyOutWindow();
		createCustomer();
//		deleteCustomer();
//		ba3.logoutUser("Admin");	
//		ba3.closeApplication();
	}	
	
	static void createCustomer()
	{
		try {
			driver.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
//			oPage.getTasks().click();
			Thread.sleep(4000);
//			driver.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")).click();
			oPage.getAddNew().click();
			Thread.sleep(2000);
//			driver.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			oPage.getAddNewCustomer().click();
			Thread.sleep(2000);
//			driver.findElement(By.id("customerLightBox_nameField")).sendKeys("Telefonica UK Ltd");
			oPage.getCustomerName().sendKeys("Telefonica UK Ltd");
//			driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Telefonica UK Ltd");
			oPage.getCustomerDescription().sendKeys("Telefonica UK Ltd");
//			driver.findElement(By.xpath("//*[@id='customerLightBox_commitBtn']/div/span")).click();
			oPage.getCreateCustomerBtn().click();
			Thread.sleep(4000);
			System.out.println("Customer created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteCustomer()
	{
		try {
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
