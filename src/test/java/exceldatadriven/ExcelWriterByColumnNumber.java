package exceldatadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriterByColumnNumber 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\123\\Desktop\\Latest drivers\\Book2.xlsx");
		FileOutputStream fos ;
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFFont font = wb.createFont();
		//XSSFCellStyle style = wb.createCellStyle();
		
		font.setFontName("Algerian");
		font.setFontHeight(14.0);
		font.setBold(true);
		
		//style.setFont(font);
		
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(4);
		
		//cell.setCellStyle(style);
		
		cell.setCellValue("Passed");
		
		fos  = new FileOutputStream("C:\\Users\\123\\Desktop\\Latest drivers\\Book2.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		fis.close();
	}

}

