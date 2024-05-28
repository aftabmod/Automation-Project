package utilitypackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelClass {

	WebDriver driver;
	
	public static String GetCellValues (String y,String Sheet,int r,int c) throws Exception
	{
		
		try
		{
			FileInputStream file = new FileInputStream(y);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFCell cell = wb.getSheet(Sheet).getRow(r).getCell(c);
			
			if (cell.getCellType()== CellType.STRING)
			{
				return cell.getStringCellValue();
				
			}
			else
			{
				return cell.getRawValue();
			}
			
		} 
		catch (IOException e) 
		{
			return "";			
		}

	}
	
	public static int GetRowCount (String y,String Sheet) throws Exception
	{
		
		try 
		{
			FileInputStream file = new FileInputStream(y);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			
			return wb.getSheet(Sheet).getLastRowNum();
			
		} 
		
		catch (FileNotFoundException e)
		{
			return 0;
		}
		
	}
		
}
  