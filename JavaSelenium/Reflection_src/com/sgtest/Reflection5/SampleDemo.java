package com.sgtest.Reflection5;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
			
		Sample obj = new Sample();
		try
		{
			Class strparm[] = new Class[1];
			strparm[0] = String.class;
			
			Class intparm[] = new Class[2];
			intparm[0]=Integer.TYPE;
			intparm[1]=Integer.TYPE;
			
			Method method1 = obj.getClass().getMethod("displayName", strparm);
			method1.invoke(obj, new String("Richard"));
			
			Method method2 = obj.getClass().getMethod("addition", intparm);
			method2.invoke(obj, 20,30);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
