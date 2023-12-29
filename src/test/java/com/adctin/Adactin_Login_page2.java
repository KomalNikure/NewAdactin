package com.adctin;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.base_class.Base_class3;

import com.sdp.PageObjectManager;

public class Adactin_Login_page2 extends Base_class3 {
	
	public static WebDriver driver=Base_class3.browserLaunch("chrome");
	 
	
	
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	public static void main(String[]args) throws IOException 
	
	{
		driver=getUrl("https://adactinhotelapp.com");
		
		
		
		String userData=readData(".\\Data_Driven\\Book_data_driven.xlsx",0,1,0);
	    inputValueElement(pom.getInstanceLp().getUsername(),userData);
		 
	
		 
		 String passData=readData(".\\Data_Driven\\Book_data_driven.xlsx",0,1,1);
		 inputValueElement(pom.getInstanceLp().getPassword(),passData);
		 
	      clickOnElement(pom.getInstanceLp().getLogin());
		  close();
	}
}
