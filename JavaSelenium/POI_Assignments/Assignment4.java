import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment4 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		Workbook wb=null;
		Sheet sh=null;
		Row row = null;
		Cell cell = null;
		String a[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		int j=0;
		try {
			wb = new XSSFWorkbook();
			sh=wb.createSheet("FruitNames");
			for(int i=0;i<12;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(i);
				
					cell.setCellValue(a[j]);
				j++;
				
				
			}
			
			fos=new FileOutputStream("E:\\JavaAutomation\\Excel\\Assignment4.xlsx");
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
