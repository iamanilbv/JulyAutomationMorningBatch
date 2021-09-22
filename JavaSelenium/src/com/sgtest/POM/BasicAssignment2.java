package com.sgtest.POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class BasicAssignment2 extends AssignmentAdvancedPOM1 {
	
	public static void main(String[] args) {

		BasicAssignment2 ba2 = new BasicAssignment2();

		ba2.launchBrowser();
		ba2.navigate();
		ba2.loginUser("admin", "manager", "Admin");
		ba2.minimizeFlyOutWindow();
		ba2.createUser("User1","Last Name","User1.test@gmail.com","User1","Testing123","Testing123","User1");
		modifyPswdForUsers("Welcome123", "Welcome123", "User1");
		deleteUsers("User1");
		ba2.logoutUser("Admin");	
		ba2.closeApplication();
	}	
	
	static void modifyPswdForUsers(String paswd, String repswd, String user)
	{
		try {
//			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
//			driver.findElement(By.xpath("//a[@*='content users']")).click();
//			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'"+user+"')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys(paswd);
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(repswd);
//			driver.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Save Changes')]")).click();
			Thread.sleep(4000);
			System.out.println(user+ " Password updated successfully");
			}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUsers(String user)
	{
		try {
//			oPage.getUsers().click();
//			Thread.sleep(2000);
			//				oPage.getAddUserSelectUser().click();
			driver.findElement(By.xpath("//span[contains(text(),'"+user+"')]")).click();
			Thread.sleep(2000);
			//				oPage.getSelectUserDeleteUser().click();
			driver.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert obj = driver.switchTo().alert();
			obj.accept();
			Thread.sleep(2000);
			System.out.println(user+ " deleted successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
