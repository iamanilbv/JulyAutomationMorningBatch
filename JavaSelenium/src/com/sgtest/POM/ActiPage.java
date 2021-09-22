package com.sgtest.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {
	
	public ActiPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
		//Login page - User Name Text Field 
		private WebElement username;
		public WebElement getUserName()
		{
			return username;
		}
		
		//Login page - Password Text Field
		private WebElement pwd;
		public WebElement getPassword()
		{
			return pwd;
		}
		
		//Login page - Login button Field
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement oLogin;
		public WebElement getLoginButton()
		{
			return oLogin;
		}
		
		//Home page - To handle flywindow
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getFlyOutWin()
		{
			return gettingStartedShortcutsPanelId;
		}
		
		//Home page - To click on Users Tab
		@FindBy(xpath="//a[@*='content users']")
		private WebElement oUsers;
		public WebElement getUsers()
		{
			return oUsers;
		}
		 
		//Users page - To click on Add User button
		@FindBy(xpath="//*[@*='addUserButton beigeButton useNativeActive']")
		private WebElement oAddUser;
		public WebElement getAddUser()
		{
			return oAddUser;
		}
		
		//Add User page - To Enter First Name
		private WebElement userDataLightBox_firstNameField;
		public WebElement getAddUserFirstName()
		{
			return userDataLightBox_firstNameField;
		}
		
		//Add User page - To Enter Last Name
		private WebElement userDataLightBox_lastNameField;
		public WebElement getAddUserLastName()
		{
			return userDataLightBox_lastNameField;
		}
		
		//Add User page - To Enter Email
		private WebElement email;
		public WebElement getAddUserEmail()
		{
			return email;
		}
		
		//Add User page - To Enter User Name(Login Details)
		private WebElement userDataLightBox_usernameField;
		public WebElement getAddUserUserName()
		{
			return userDataLightBox_usernameField;
		}
		
		//Add User page - To Enter Password
		private WebElement userDataLightBox_passwordField;
		public WebElement getAddUserPassword()
		{
			return userDataLightBox_passwordField;
		}
		
		//Add User page - To Enter ReType Password
		private WebElement passwordCopy;
		public WebElement getAddUserReTypePassword()
		{
			return passwordCopy;
		}
		
		//Users page - To click on Create User button
		@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
		private WebElement oCreateUser;
		public WebElement getAddUserCreateUser()
		{
			return oCreateUser;
		}
		
		//Select User under Users tab 
		@FindBy(xpath="//span[contains(text(),'+user')]")
		private WebElement oSelectUser;
		public WebElement getAddUserSelectUser()
		{
			return oCreateUser;
		}
		
		//Select User page - To click on Delete User button 
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getSelectUserDeleteUser()
		{
			return userDataLightBox_deleteBtn;
		}
		
		//Select User page - To click on Save Changes button 
		@FindBy(xpath="//span[contains(text(),'Save Changes')]")
		private WebElement oAddUserSaveChanges;
		public WebElement getAddUserEditSaveChanges()
		{
			return oAddUserSaveChanges;
		}
		
		//Select User page - To click on Start Exploring to ActiTime button 
		@FindBy(xpath="//span[contains(text(),'Start exploring actiTIME')]")
		private WebElement oExitAutoPlay;
		public WebElement getExitAutoPlay()
		{
			return oExitAutoPlay;
		}
		
		//Home page - To click on Tasks Tab
		@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr/td[3]/a")
		private WebElement oTasks;
		public WebElement getTasks()
		{
			return oTasks;
		}
		
		//Tasks Tab - To click on Add New dropdown
		@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[3]")
		private WebElement oAddNew;
		public WebElement getAddNew()
		{
			return oAddNew;
		}
		
		//Tasks Tab -> Add New dropdown - To click on New Customer
		@FindBy(xpath="/html/body/div[14]/div[1]")
		private WebElement oAddNewCustomer;
		public WebElement getAddNewCustomer()
		{
			return oAddNewCustomer;
		}
		
		//New Customer Page - To enter Customer Name
		private WebElement customerLightBox_nameField;
		public WebElement getCustomerName()
		{
		return customerLightBox_nameField;
		}
		
		//New Customer Page - To enter Customer Description
		private WebElement customerLightBox_descriptionField;
		public WebElement getCustomerDescription()
		{
			return customerLightBox_descriptionField;
		}
		
		//New Customer Page - To click on Create Customer button
		@FindBy(xpath="//*[@id='customerLightBox_commitBtn']/div/span")
		private WebElement oCreateCustomerBtn;
		public WebElement getCreateCustomerBtn()
		{
			return oCreateCustomerBtn;
		}
		
		
}
