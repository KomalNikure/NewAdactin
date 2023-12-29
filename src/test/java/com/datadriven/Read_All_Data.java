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
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Read_All_Data {
public static void main(String[]args) throws IOException 
{
	File f=new File("C:\\Users\\Home\\eclipse-workspace\\New_Maven_Project\\Data_Driven\\Book_data_driven.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook book=new XSSFWorkbook(fis);
	 Sheet sheetAt = book.getSheetAt(0);

	int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
	System.out.println("Rows:"+ physicalNumberOfRows);
	
	int physicalNumberOfCells=0;
	
	for(int i=0;i<physicalNumberOfRows;i++) 
	{
		Row row = sheetAt.getRow(i);
		
		physicalNumberOfCells = row.getPhysicalNumberOfCells();
		
		for(int j=0;j<physicalNumberOfCells;j++) 
		{
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			
			if(cellType.equals(CellType.STRING))
			{
				String stringCellValue=cell.getStringCellValue();
				System.out.print(stringCellValue + "");
			}
			
//			else if(cellType.equals(cellType.NUMERIC))
//			{
//				double numericCellValue=cell.getNumericCellValue();
//				int cellValue=(int) numericCellValue;
//				System.out.print(cellValue+"");
//			}
		}
		System.out.println();
	}
	System.out.println("Cells:"+physicalNumberOfCells);
}
}
