package com.sgtest.ReflectionActi;

//Working for Reflection for all the 7 Tc's

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestRunner3 {

	public static void main(String[] args) {
		
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			fin=new FileInputStream("E:\\JavaAutomation\\Automation\\JavaSelenium\\DataFiles\\Reflection.xlsx");
			wb=new XSSFWorkbook(fin);
			int sc=wb.getNumberOfSheets();
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Total no of Sheet in excell sheet is :" +sc);
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
			for(int s=0; s<sc;s++)
			{
				String sname=wb.getSheetName(s);
				System.out.println("Sheet Name is: "+sname);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				sh=wb.getSheet(sname);
				
				int rc=sh.getPhysicalNumberOfRows();
				
				
				for(int r=1;r<rc;r++)
				{
					row=sh.getRow(r);
					cell=row.getCell(0);
					String MethodName=cell.getStringCellValue();
					cell=row.getCell(1);
					String PackageClsName=cell.getStringCellValue();
					
					System.out.println(MethodName+ "  ---->  "+PackageClsName);
					
					Class cls=Class.forName(PackageClsName);
					Object obj=cls.newInstance();
					
					Method method=obj.getClass().getMethod(MethodName, null);
					method.invoke(obj, null);
				}



			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
