package com.sgtest.POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class BasicAssignment1 extends AssignmentAdvancedPOM1{

	public static void main(String[] args) {

		BasicAssignment1 ba1 = new BasicAssignment1();

		ba1.launchBrowser();
		ba1.navigate();
		ba1.loginUser("admin", "manager", "Admin");
		ba1.minimizeFlyOutWindow();
		ba1.createUser("User1","Last Name","User1.test@gmail.com","User1","Testing123","Testing123","User1");
		deleteUsers("User1");
		ba1.logoutUser("Admin");	
		ba1.closeApplication();
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


