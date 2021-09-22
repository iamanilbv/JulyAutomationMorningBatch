package com.sgtest.POIExcel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteContentToExcel {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
				
		try {
			wb = new XSSFWorkbook();
			sh=wb.createSheet("Information");
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("UserName");
			cell=row.createCell(1);
			cell.setCellValue("Password");
			
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("F1");
			cell=row.createCell(1);
			cell.setCellValue("Admin");
			
			
			
			fos=new FileOutputStream("E:\\JavaAutomation\\Excel\\Test1.xlsx");
			wb.write(fos);
			System.out.println("File written successfully");
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fos.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
