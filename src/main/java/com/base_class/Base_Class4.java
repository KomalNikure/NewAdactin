package com.base_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Base_Class4 {

	public static WebDriver driver;
	public static WebDriver getDriver(String type)
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

	//method
	public static void getUrl(String url)
	{
		 driver.get(url);
	}
		
	//method 
	public static void currentUrl() 
	{
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	//method
	
	public static void forword() 
	{
		driver.navigate().forward();
	}
	
	//method
	public static void backword() 
	{
		driver.navigate().back();
	}
	//method
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	
	//method
	public static void navigateTo(String url)
	{
		driver.navigate().to("url");
	}
	
	//method
	
	public static void quite() 
	{
		driver.quit();
	}
	
	//method
	
	public static void getTitle() 
	{
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	//method
	
	public static void enabled(WebElement element)
	{
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}
	
	//method
	public static void displayed(WebElement element) 
	{
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}
	
	//method
	
	public static  void selected(WebElement element) 
	{
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
	//method
	public static void screenshot(String path) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		File Destination=new File("path");
		FileUtils.copyFileToDirectory(sourceFile, Destination);
	}
	
	//method
	
	public static void selection(WebElement element,String Option,String value) 
	{
		Select sc=new Select(element);
		try {
			if (Option.equalsIgnoreCase("byIndex"))
			{
				int parseInt=Integer.parseInt(value);
				sc.selectByIndex(parseInt);
				}
				else if(Option.equalsIgnoreCase("byValue")) 
				{
					sc.selectByValue(value);
				}
				else if(Option.equalsIgnoreCase("byVisibleTest"))
				{
					sc.selectByVisibleText(value);
				}
				else 
				{
					System.out.println("Invalid option");
				}
			
		}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
	}
		
	
		
		//method
		
		public static void inputValueElement2(WebElement element2,String value2) 
		{
			element2.sendKeys(value2);
		}
		
		//method
		
		public static void clickOnElement3 (WebElement element3) 
		{
			element3.click();
		}
		//method
		public static void simpleAlert() 
		{
			driver.switchTo().alert().accept();
		}
		//method
		
		public static void confirmAlert(String ok,String cancel) 
		{
			if(ok.equalsIgnoreCase("ok"))
					{
				driver.switchTo().alert().accept();
					}
			else if(cancel.equalsIgnoreCase("cancel"))
			{
				driver.switchTo().alert().dismiss();
			}
			
		}
		
		//method
		
		public static void promptAlert(String ok,String value,String cancel) 
		{
			if(ok.equalsIgnoreCase("ok"))
			{
				driver.switchTo().alert().sendKeys(value);
				
				driver.switchTo().alert().accept();
			}
			
			else if(cancel.equalsIgnoreCase("cancel"))
			{
				driver.switchTo().alert().sendKeys(value);
				driver.switchTo().alert().accept();
			}
		}
		
		//method
		
		public static void actionMethod(WebElement Element) 
		{
			Actions ac=new Actions(driver);
			ac.moveToElement(Element).build().perform();
		}

		
		//method
		
		public static void dropDown(WebElement Element,WebElement Element1)
		{
			Actions ad=new Actions(driver);
			ad.dragAndDrop(Element, Element1).build().perform();
		
			}
		
		public static void robotClass() throws AWTException 
		{
			Robot rb=new Robot();
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.keyPress(KeyEvent.VK_ENTER);
		}
		
		public static void pageUp(WebElement element) 
		{
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("argument[0].scrollIntoView();", element);
		}
		
		public static void pageDown(WebElement element) 
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].scrollIntoView;", element);
		}
		
		public static void frameMethod(String option,String value,WebElement element)
		{
			try {
				if
			}
		}
		
	
}

