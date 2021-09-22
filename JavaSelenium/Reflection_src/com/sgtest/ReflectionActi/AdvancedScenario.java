package com.sgtest.ReflectionActi;

import java.lang.reflect.Method;

public class AdvancedScenario {

	public static void main(String[] args) {

		AdvancedScenario1 obj1 = new AdvancedScenario1();
		
		try
		{
			
			obj1.launchBrowser();
			obj1.navigate();
			obj1.loginUser("admin","manager","Admin");
			
			Class strparm[] = new Class[3];
			strparm[0] = String.class;
			strparm[1] = String.class;
			strparm[2] = String.class;
			
			Method method1 = obj1.getClass().getMethod("loginUser", strparm);
			method1.invoke(obj1, new String("admin"),new String("manager"),new String("Admin"));
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
