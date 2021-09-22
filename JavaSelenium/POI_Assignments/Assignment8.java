import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Assignment8 {

	public static void main(String[] args) {
		readWriteContent();

	}
	
	static void readWriteContent()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Workbook wb1=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row rowsh1=null;
		Row rowsh2=null;
		Cell cellsh1=null;
		Cell cellsh2=null;
		try
		{
			fin=new FileInputStream("E:\\JavaAutomation\\Excel\\Assignment8.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			String a[]=new String[6];
			
				rowsh1=sh1.getRow(10);
				rowsh2=sh2.createRow(10);
				
				int cc=rowsh1.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cellsh1=rowsh1.getCell(c);
					String data=cellsh1.getStringCellValue();
					a[c]=data;
				}
				
				wb1 = new XSSFWorkbook();
//				wb1.createSheet()
//				for()
//				
//				fout=new FileOutputStream("E:\\JavaAutomation\\Excel\\Assignment9.xlsx");
//				wb.write(fout);
				
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
				wb=null;
				sh1=null;
				rowsh1=null;
				cellsh1=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}


}
