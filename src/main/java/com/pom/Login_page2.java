package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page2 {
public static WebDriver driver;//null
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement login;
	
	public void Login_page2(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}

	public WebElement getUsername() 
	{
		return username;
	}
	
	public WebElement getPassword() 
	{
		return username;
	}
	public WebElement getLogin() 
	{
		return username;
	}
}
