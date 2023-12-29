package com.adctin;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base_class.Base_class3;

public class Adactin_Runner3  extends Base_class3
{
	
	public static WebDriver driver;
 public static void main(String[]args) throws IOException 
 {
	 driver= browserLaunch("chrome");
	 
	 driver=getUrl("https://adactinhotelapp.com");
	 WebElement username=driver.findElement(By.id("username"));
	 String userData=readData(".\\Data_Driven\\Book_data_driven.xlsx",0,1,0);
	 
	 inputValueElement(username,userData);
	 
	 WebElement password=driver.findElement(By.id("password"));
	 String passData=readData(".\\Data_Driven\\Book_data_driven.xlsx",0,1,1);
	 
	 inputValueElement(password, passData);
	 
	 WebElement login=driver.findElement(By.id("login"));
	 
	 clickOnElement(login);
	 
	 close();
 }
}
