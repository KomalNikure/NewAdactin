package com.adctin;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.base_class.BaseClass2;



public class Adctin_Runner extends BaseClass2 {
 
	
	public static WebDriver driver;
	
	public static void main(String[] args) 
	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
	//driver.get("https://adactinhotelapp.com");
		//driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		
		driver = browserLaunch("chrome");
		driver = getUrl("https://adactinhotelapp.com/");
		
				
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		//username.sendKeys("komnikure");
		inputValueElement(username,"komnikure");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		//password.sendKeys("nik2703");
		inputValueElement(password,"nik2703");
		
		WebElement login = driver.findElement(By.xpath("//input[contains(@name,'login')]"));
		clickOnElement(login);
	}
}
