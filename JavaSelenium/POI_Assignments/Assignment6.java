import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment6 {

	public static void main(String[] args) {
		readWriteContent();

	}
	
	static void readWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row rowsh1=null;
		Row rowsh2=null;
		Cell cellsh1=null;
		Cell cellsh2=null;
		try
		{
			fin=new FileInputStream("E:\\JavaAutomation\\Excel\\Assignment6.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
					
			
			int rc=sh1.getPhysicalNumberOfRows();
			
			sh2=wb.getSheet("Sheet2");
			rowsh2=sh2.createRow(5);
			for(int r=0;r<rc;r++)
			{
				rowsh1=sh1.getRow(r);
				
				
				int cc=rowsh1.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cellsh1=rowsh1.getCell(c);
					
					String data=cellsh1.getStringCellValue();
					
					cellsh2=rowsh2.createCell(r);
					
					
					
				
					
					
					
					cellsh2.setCellValue(data);
					
					
			
					
					
				}
			}
			
			
			fout=new FileOutputStream("E:\\JavaAutomation\\Excel\\Assignment6.xlsx");
			wb.write(fout);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
				wb.close();
				wb=null;
				sh1=null;
				sh2=null;
				rowsh1=null;
				rowsh2=null;
				cellsh1=null;
				cellsh2=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
