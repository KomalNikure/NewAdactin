package com.base_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

//BASE CLASS EXTENDS WITH ADACTIN RUNNER 



//import com.microsoft.schemas.office.visio.x2012.main.CellType;
public class Base_class3 {
	public static WebDriver driver;
	public static  String value;
		
	public static WebDriver browserLaunch(String type) 
	{
		if(type.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Home\\eclipse-workspace\\New_Maven_Project\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(type.equalsIgnoreCase("firefox")) 
		
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\Home\\eclipse-workspace\\New_Maven_Project\\driver\\edgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}

public static WebDriver getUrl(String url) 
{
	driver.get(url);
	return  driver;
	
}

public static void inputValueElement(WebElement element,String value)
{
	
element.sendKeys(value);

}
public static void clickOnElement(WebElement element) 
{
	element.click();
	}


public static void dropDown(String type,WebElement element,String value) 
{
	Select s=new Select(element);
	
	if(type.equalsIgnoreCase("value"))
	{
		s.selectByValue(value);
	}
	
	else if(type.equalsIgnoreCase("index")) 
	{
		int data =Integer.parseInt(value);
		s.selectByIndex(data);
	}
	else if(type.equalsIgnoreCase("text")) 
	{
		s.selectByVisibleText(value);
	}
}
	
	public static String readData(String path,int sheetIndex,int rowIndex,int cellIndex) throws IOException
	{
		File f=new File(".\\Data_Driven\\Book_data_driven.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb =new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(0);
		
		Cell cell = row.getCell(1);
		  CellType cellType = cell.getCellType();
		 
		
		if(cellType.equals(CellType.STRING)) 
			
		{
			value=cell.getStringCellValue();
		}
		
		else if(cellType.equals(CellType.NUMERIC)) 
		
		{
			double numericCellValue=cell.getNumericCellValue();
			int data = (int) numericCellValue;
			value = String.valueOf(data);
			
		}
		
		wb.close();
		return value;
				
	}
	
	public static WebDriver close() 
	{
		driver.close();
		return driver;
	}
	
	public static WebDriver quit() 
	{
		driver.quit();
		return driver;
	}
	
	
	
	}

