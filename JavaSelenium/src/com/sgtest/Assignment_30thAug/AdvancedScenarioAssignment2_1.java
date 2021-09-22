package com.sgtest.Assignment_30thAug;

public class AdvancedScenarioAssignment2_1 extends AdvancedScenarioAssignment1_1 {
	
	public static void main(String[] args) {
	
		AdvancedScenarioAssignment2_1 obj2 = new AdvancedScenarioAssignment2_1();
		
		obj2.launchBrowser();
		obj2.navigate();
		obj2.loginUser("admin", "manager", "Admin");
		obj2.minimizeFlyOutWindow();
		obj2.createUser("User1","Last Name","User1.test@gmail.com","User1","Testing123","Testing123","User1");
		obj2.logoutUser("Admin");
		obj2.loginUser("User1", "Testing123", "User1");
		obj2.handleWelcomeScreen("User1");
		obj2.createUser("User2","Last Name","User2.test@gmail.com","User2","Testing123","Testing123","User2");
		obj2.logoutUser("User1");
		obj2.loginUser("User2", "Testing123", "User2");
		obj2.handleWelcomeScreen("User2");
		obj2.createUser("User3","Last Name","User3.test@gmail.com","User3","Testing123","Testing123","User3");
		obj2.logoutUser("User2");
		obj2.loginUser("User3", "Testing123", "User3");
		obj2.handleWelcomeScreen("User3");
		obj2.logoutUser("User3");
		obj2.loginUser("User2", "Testing123", "User2");
		obj2.modifyPswdForUser("Welcome123", "Welcome123", "User3");
		obj2.logoutUser("User3");
		obj2.loginUser("User3", "Welcome123", "User3");
		obj2.logoutUser("User3");
		obj2.loginUser("User1", "Testing123", "User1");
		obj2.modifyPswdForUser("Welcome123", "Welcome123", "User2");
		obj2.logoutUser("User1");
		obj2.loginUser("User2", "Welcome123", "User2");
		obj2.logoutUser("User2");
		obj2.loginUser("admin", "manager", "Admin");
		obj2.modifyPswdForUser("Welcome123", "Welcome123", "User1");
		obj2.logoutUser("Admin");
		obj2.loginUser("User1", "Welcome123", "User1");
		obj2.logoutUser("User1");
		obj2.loginUser("User2", "Welcome123", "User2");
		obj2.deleteUser("User3");
		obj2.logoutUser("User2");
		obj2.loginUser("User1", "Welcome123", "User1");
		obj2.deleteUser("User2");
		obj2.logoutUser("User1");
		obj2.loginUser("admin", "manager", "Admin");
		obj2.deleteUser("User1");
		obj2.logoutUser("Admin");	
		obj2.closeApplication();

	}
}
