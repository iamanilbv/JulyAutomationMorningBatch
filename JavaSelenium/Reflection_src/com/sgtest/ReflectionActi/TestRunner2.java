package com.sgtest.ReflectionActi;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Using Iterator Methods

public class TestRunner2 {

	public static void main(String[] args) {
		
		FileInputStream fin = null;
		Workbook wb=null;
//		Sheet sh = null;
//		Row row = null;
		Cell cell = null;		
		
		try {
			fin = new FileInputStream(".\\DataFiles\\data_Runner1.xlsx");
			wb = new XSSFWorkbook(fin);
			DataFormatter df = new DataFormatter();
			Iterator<Sheet> sheets = wb.sheetIterator();
			while(sheets.hasNext()) {
				Sheet sh = sheets.next();
				System.out.println("Sheet Name is: "+sh.getSheetName());
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
				Iterator<Row> iterator = sh.iterator();
				while(iterator.hasNext()) {
					Row row = iterator.next();
					
					cell=row.getCell(0);
					String methodname=cell.getStringCellValue();
					cell=row.getCell(1);
					String pkgClassName=cell.getStringCellValue();
					
					System.out.println(methodname+ "  ---->  "+pkgClassName);
					
					Class cls=Class.forName(pkgClassName);
					Object obj=cls.newInstance();
					
					Method method=obj.getClass().getMethod(methodname, null);
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

				cell = null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
