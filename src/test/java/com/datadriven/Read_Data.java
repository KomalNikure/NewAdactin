package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void main(String[]args) throws IOException 
	{
	File f=new File("C:\\Users\\Home\\eclipse-workspace\\New_Maven_Project\\Data_Driven\\Book_data_driven.xlsx");
	FileInputStream file=new FileInputStream(f);
	Workbook book=new XSSFWorkbook(file);
	Sheet sheetAt=book.getSheet("Sheet1");
	
	//Row row=sheetAt.getRow(0);
	//Cell cell=row.getCell(0);
	
	Row row=sheetAt.getRow(1);
	Cell cell=row.getCell(1);
	CellType cellType=cell.getCellType();
	
	if(cellType.equals(cellType.STRING))
			
	{
		System.out.println(cell.getStringCellValue());
	}
	
	else if(cellType.equals(cellType.NUMERIC))
	{
		System.out.println(cell.getNumericCellValue());
	}
	
//	else if(cellType.equals(cellType.NUMERIC))   //typecasting data change from double to int
//	{  
//		double numericCellValue = cell.getNumericCellValue();
//		int t = (int) numericCellValue;
//		System.out.println(t);
//	}
	
	}
}


