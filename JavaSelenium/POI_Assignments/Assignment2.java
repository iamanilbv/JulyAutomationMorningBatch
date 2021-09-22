import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment2 {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		Workbook wb=null;
		Sheet sh=null;
		Row row = null;
		Cell cell = null;
				
		try {
			wb = new XSSFWorkbook();
			sh=wb.createSheet("FruitNames");
			row=sh.createRow(10);
			for(int i=0;i<20;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue("Fruit"+i);
			}
			
				
			
			fos=new FileOutputStream("E:\\JavaAutomation\\Excel\\Assignment2.xlsx");
			wb.write(fos);
			System.out.println("File written successfully");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			
		}
		try {
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
