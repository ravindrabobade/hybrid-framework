package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataprovider {
	XSSFWorkbook wb;
	
	public exceldataprovider() throws IOException {
		String path=System.getProperty("user.dir")+"\\Testdata\\Data.xlsx";
		FileInputStream fis1=new FileInputStream(path);
		 wb=new XSSFWorkbook(fis1);
	
		
	}
	
	public String getstringvalue(String sheetname, int row, int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		
	}
	
}
