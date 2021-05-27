package exceldatadriven;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterByColumnName 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\123\\Desktop\\Latest drivers\\testdata.xlsx");
		FileOutputStream fos ; 
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(4);
	    cell.setCellValue("passed");
		
		fos = new FileOutputStream("C:\\Users\\123\\Desktop\\Latest drivers\\testdata.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		

	}

}


