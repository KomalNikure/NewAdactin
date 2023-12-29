package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Login_page2;

public class PageObjectManager {


public static WebDriver driver;

private Login_page2 Lp;

public PageObjectManager(WebDriver abc)

{
	this.driver = abc;
	
}

public Login_page2 getInstanceLp() 
{
	Lp = new Login_page2();
	return Lp;
	}
}

