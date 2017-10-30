package tpProject;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.hssf.usermodel.HSSFCell;

import org.apache.poi.hssf.usermodel.HSSFRow;

import org.apache.poi.hssf.usermodel.HSSFSheet;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class ReadExcelSheet {
	
	HSSFWorkbook workbook;
	HSSFSheet sheet;
	HSSFCell cell;
	
	public void readExcel() throws IOException
	{
		File src = new File("");
		FileInputStream input = new FileInputStream(src);
		workbook = new HSSFWorkbook(input);
		
	}
	public String readExcelSheetData(int row,int col)
	{
		String sheetData = null;
		int sheetnum = workbook.getNumberOfSheets();
		for (int i = 0; i < sheetnum; i++) {
			
			for (int j = 0; j < row; j++) {
				
				for (int j2 = 0; j2 < col; j2++) {
					cell = sheet.getRow(row).getCell(col);
					sheetData = cell.getStringCellValue();
				} 
			}
		}
		return sheetData;
	}
	
}