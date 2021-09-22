package com.sgtest.POIExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadContentPractice {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("E:\\JavaAutomation\\Excel\\Test.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rc = sh.getLastRowNum();
		for(int r=0;r<rc;r++)
		{
			String data=sh.getRow(r).getCell(0).getStringCellValue();
			System.out.println("Data from row"+r+" is "+data);
		}

		
		wb.close();
		
		
		
		
	}

}
