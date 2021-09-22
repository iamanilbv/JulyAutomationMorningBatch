package com.sgtest.ReflectionActi;

//Working for Reflection for all the 7 Tc's

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestRunner {

	public static void main(String[] args) {
		
		FileInputStream fin = null;
		Workbook wb=null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;		
		
		try {
			fin = new FileInputStream("E:\\JavaAutomation\\Automation\\JavaSelenium\\DataFiles\\Reflection.xlsx");
			wb = new XSSFWorkbook(fin);
			int sheetcount=wb.getNumberOfSheets();
			System.out.println("# Of Sheets: "+sheetcount);
			for(int s=0;s<sheetcount;s++)
			{
				String sname=wb.getSheetName(s);
				System.out.println("Sheet Name: "+sname);
				sh=wb.getSheet(sname);
				
//				sh=wb.getSheetAt(s);
				
				
			
				int rc=sh.getPhysicalNumberOfRows();
				for(int r=1;r<rc;r++)
				{
					row=sh.getRow(r);
					cell=row.getCell(0);
					String MethodName=cell.getStringCellValue();
					cell=row.getCell(1);
					String PackageClassName=cell.getStringCellValue();
					
					System.out.println(MethodName+ "  ---->  "+PackageClassName);
					
					Class cls=Class.forName(PackageClassName);
					Object obj=cls.newInstance();
					
					Method method=obj.getClass().getMethod(MethodName, null);
					method.invoke(obj, null);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				fin.close();
				wb.close();
				wb=null;
				sh = null;
				row = null;
				cell = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
