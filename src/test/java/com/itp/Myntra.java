package com.itp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra
{
static WebDriver driver;
	
	public static void lauchbrowser() 
	{
	  	
	      WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//a[text()='Kids'][1]")).click();
		
	}
	
	public static void Tshirt() 
	{
	
//	List<WebElement>allTshirt=driver.findElements(By.xpath("//img[@class='img-responsive']"));
//	int size=allTshirt.size();
//	System.out.println("total number of Tshirt is" +size);
//		
		List<WebElement>allTshirt1=driver.findElements(By.xpath("//li[@class='product-base']"));
	    int size1=allTshirt1.size();
		System.out.println("total number of Tshirt is" +size1);
		
		for(int i=0;i<size1;i++)
		{
			WebElement names=allTshirt1.get(i);
			System.out.println(names.getText());
		}
	
	}
	
	public static void minimumprice()
	{
		List<WebElement>minimum_price=driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
	int size=minimum_price.size();
	System.out.println("minium price of T-shirt"+size);
	}
	
  public static void main(String[]args) 
 
  {
	  lauchbrowser() ;
	  Tshirt() ;
	minimumprice();
	
}
}

