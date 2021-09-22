package com.sgtest.Assignment_30thAug;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtest.POM.ActiPage;

public class AdvancedScenarioAssignment1_1 {
	
	public static WebDriver driver = null;
	
	
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver=new ChromeDriver();
			System.out.println("Chrome browser launched successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void navigate()
	{
		try
		{
			driver.manage().window().maximize();
			driver.get("http://localhost:82/login.do");
			Thread.sleep(3000);
			System.out.println("Active time URL launched successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void loginUser(String username, String password, String user)
	{
		try
		{
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
//			driver.findElement(By.xpath("//*[@id='loginButton']/div")).click();//a[div='Login ']
			driver.findElement(By.xpath("//a[div='Login ']")).click();
			Thread.sleep(5000);
			System.out.println(user+" logged in succssfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void handleWelcomeScreen(String user)
	{
		try {
			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'Start exploring actiTIME')]")).click();
			System.out.println(user+" handled Welcome screen");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void minimizeFlyOutWindow()
	{
		try
		{
			driver.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			System.out.println("Minimized FlyOutWindow successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void createUser(String firstname, String lastname, String email, String loginName, String pswd, String repaswd, String user)
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
//			driver.findElement(By.xpath("//a[@*='content users']")).click();
			Thread.sleep(2000);
//			driver.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			driver.findElement(By.xpath("//*[@*='addUserButton beigeButton useNativeActive']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("userDataLightBox_firstNameField")).sendKeys(firstname);
			driver.findElement(By.id("userDataLightBox_lastNameField")).sendKeys(lastname);
			driver.findElement(By.id("userDataLightBox_emailField")).sendKeys(email);
			driver.findElement(By.id("userDataLightBox_usernameField")).sendKeys(loginName);
			driver.findElement(By.id("userDataLightBox_passwordField")).sendKeys(pswd);
			driver.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys(repaswd);
			driver.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
			System.out.println(user+ " created successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void deleteUser(String user)
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
//			driver.findElement(By.xpath("//a[@*='content users']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'"+user+"')]")).click();
			Thread.sleep(2000);
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
	
	public void modifyPswdForUser(String paswd, String repswd, String user)
	{
		try {
			driver.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
//			driver.findElement(By.xpath("//a[@*='content users']")).click();
			Thread.sleep(3000);
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
	
	public void closeApplication()
	{
		try
		{
			driver.close();
			Thread.sleep(2000);
			System.out.println("Active time Chrome Broswer closed successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}	
	
	public void logoutUser(String user)
	{
		try {
			driver.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			System.out.println(user+ " logged out successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
	
		AdvancedScenarioAssignment1_1 obj1 = new AdvancedScenarioAssignment1_1();
		obj1.launchBrowser();
		obj1.navigate();
		obj1.loginUser("admin","manager","Admin");
		obj1.minimizeFlyOutWindow();
		obj1.createUser("User1","Last Name","User1.test@gmail.com","User1","Testing123","Testing123","User1");
		obj1.createUser("User2","Last Name","User2.test@gmail.com","User2","Testing123","Testing123","User2");
		obj1.createUser("User3","Last Name","User3.test@gmail.com","User3","Testing123","Testing123","User3");
		obj1.logoutUser("Admin");
		obj1.loginUser("User1","Testing123","User1");
		obj1.handleWelcomeScreen("User1");
		obj1.logoutUser("User1");
		obj1.loginUser("User2","Testing123","User2");
		obj1.handleWelcomeScreen("User2");
		obj1.logoutUser("User2");
		obj1.loginUser("User3","Testing123","User3");
		obj1.handleWelcomeScreen("User3");
		obj1.logoutUser("User3");
		obj1.loginUser("admin","manager","Admin");
		obj1.modifyPswdForUser("Welcome123","Welcome123","User1");
		obj1.modifyPswdForUser("Welcome123","Welcome123","User2");
		obj1.modifyPswdForUser("Welcome123","Welcome123","User3");
		obj1.logoutUser("Admin");
		obj1.loginUser("User1","Welcome123","User1");
		obj1.logoutUser("User1");
		obj1.loginUser("User2","Welcome123","User2");
		obj1.logoutUser("User2");
		obj1.loginUser("User3","Welcome123","User3");
		obj1.logoutUser("User3");
		obj1.loginUser("admin","manager","Admin");
		obj1.deleteUser("User1");
		obj1.deleteUser("User2");
		obj1.deleteUser("User3");
		obj1.logoutUser("Admin");
		obj1.closeApplication();		
			
	}
}