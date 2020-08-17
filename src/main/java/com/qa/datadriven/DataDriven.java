package com.qa.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven   {
	public static String FetchDataFromExcel(String sheetn,int rown,int coln) throws IOException
	{
		String data;
		String FilePath = System.getProperty("user.dir")+"\\src\\test\\resources\\ZeroB.xlsx";
		FileInputStream fis = new FileInputStream(FilePath);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Login1");
		XSSFRow row= sheet.getRow(rown);
		XSSFCell cell = row.getCell(coln);
		data= cell.getStringCellValue();
		return data;
		
	}

}
