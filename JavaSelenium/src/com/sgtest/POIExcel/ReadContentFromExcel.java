package com.sgtest.POIExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadContentFromExcel {

	public static void main(String[] args) throws IOException {
		
		readContentFromExcelFile();
	}

	public static void readContentFromExcelFile() throws IOException {
		
		FileInputStream fis = null;
		Workbook wb=null;
		Sheet sh =null;
		Row row =null;
		Cell cell =null;
			
		try {
			fis = new FileInputStream("E:\\JavaAutomation\\Excel\\Test.xlsx");
			wb = new XSSFWorkbook(fis);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					String data=cell.getStringCellValue();
					System.out.print(data+ " || ");
				}
				System.out.println();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			fis.close();
			wb.close();
			wb=null;
			sh=null;
			row=null;
			cell=null;		
		}try {
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
