package com.project_itp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra

{
	public static WebDriver driver;
	public static void launch_url() 
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
	}
	
	
	public static void kids() 
	{
		driver.findElement(By.xpath("//a[text()='Kids'][1]")).click();
	}
	
	public static void total_product() 
	{
		List<WebElement> totalproduct = driver.findElements(By.xpath("//li[@class='product-base']"));
		int size=totalproduct.size();
		System.out.println("total number of product:" +size);
	}
	public static void main(String[] args) {
		launch_url();
		kids();
		total_product();
	}

}
