package com.sgtest.Reflection4;

public class SampleDemo {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.sgtest.Reflection4.Sample");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
