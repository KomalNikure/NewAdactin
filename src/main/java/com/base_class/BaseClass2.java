package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType;

public class BaseClass2 {

	public static WebDriver driver;
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
}
