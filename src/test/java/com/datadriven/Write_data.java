package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Write_data {
 public static void main(String[]args) throws IOException 
 {
	 File f=new File("C:\\Users\\Home\\eclipse-workspace\\New_Maven_Project\\Data_Driven\\Book_data_driven.xlsx");
	 FileInputStream file=new FileInputStream(f);
	 Workbook book=new XSSFWorkbook(file);
	 
 //Sheet sheet=book.createSheet("New_sheet");
//	 Row row=sheet.createRow(0);
//	 row.createCell(0).setCellValue("java");
	 
	
	 
	 //book.getSheetAt(3).getRow(0).createCell(1).setCellValue("python");
	
	 
	 FileOutputStream fos=new FileOutputStream(f);
	 book.write(fos);
	 
	 System.out.println("Done");

 }
}
