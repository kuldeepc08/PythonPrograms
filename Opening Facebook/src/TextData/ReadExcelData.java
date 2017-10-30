package TextData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelData {

	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFCell cell;
	
	
	public void readData() throws IOException
	{
		File src = new File("");
		FileInputStream stream = new FileInputStream(src);
		workbook = new HSSFWorkbook(stream); 
		sheet = workbook.getSheetAt(0);
	}
	public String getCellData(int row,int col)
	{
		String sheetData;
		cell = sheet.getRow(row).getCell(col);
		sheetData = cell.getStringCellValue();
		return sheetData;
		
	}
}
