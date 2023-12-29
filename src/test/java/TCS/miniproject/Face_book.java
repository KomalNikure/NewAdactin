package TCS.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Face_book 
{
 static WebDriver driver;
	public static void LaunchBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		
		
		//driver.manage().window().maximize();
//		options.addArguments("start-maximized");
//		options.addArguments("incognito");
		
		
		List<String>opt=new ArrayList<String>();
		opt.add("start-maximized");
		opt.add("incognito");
		options.addArguments(opt);
		driver=new ChromeDriver(options);
	}
	
	 public static void LaunchUrl()
	 {
		 driver.get("https://www.facebook.com");
		 

	 }
	 
	 public static void Webelement() throws InterruptedException 
	 {
		 String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
			WebElement fbook = driver.findElement(By.cssSelector("[class$=img]"));
			String url2 = fbook.getText();
			
			boolean equalsIgnoreCase = currentUrl.equalsIgnoreCase(url2);
			System.out.println(equalsIgnoreCase);
			
			Thread.sleep(3000);
			
			if(currentUrl.contains(url2))
			{
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("@123");
			}
			else
			{
				System.out.println("wrong xpath");
			}
			
			if(currentUrl.contains(url2))
			{
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
			}
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@name='login']")).click();

	 }
	 
	 public static void Screnshot() throws InterruptedException, IOException 
	 {
		 Thread.sleep(1000);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\screenshot\\error_s.png");
			FileUtils.copyFile(source, des);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Create new account']")).click();


			TakesScreenshot ts2=(TakesScreenshot)driver;
			File source2=ts2.getScreenshotAs(OutputType.FILE);
			File des2=new File("C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\screenshot\\facebook_s.png");
			FileUtils.copyFile(source2, des2);
			
			Thread.sleep(1000);
			WebElement sign = driver.findElement(By.xpath("//div[text()='Sign Up']"));
			String s=sign.getText();
			
			WebElement sign2 = driver.findElement(By.xpath("//button[text()='Sign Up'][1]"));
			String s2=sign2.getText();
			
			
			boolean equalsIgnoreCase2 = s.equalsIgnoreCase(s2);
			

			System.out.println(equalsIgnoreCase2);
			
			
			if(s.contains(s2)) 
			{
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("xyz");
			}
			
			else {
				System.out.println("wrong input");
			}
			
			
			if(s.contains(s2)) 
			{
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("zyx");
				//driver.findElement(By.xpath("//div[text()='Mobile number or email address']")).sendKeys("9834465119");
			}
			
			
			else 
			{
				System.out.println("wrong input");
			}
			
			
			Thread.sleep(1000);
			

			
			if(s.contains(s2))
			{
				
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9834465119");
			
			Thread.sleep(500);
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abcd");
			}
		
			else 
			{
				System.out.println("wrong input");
		    }

	 
	 WebElement selectDoB = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select DB=new Select(selectDoB);
		DB.selectByIndex(1);
		
		WebElement DoB_mo= driver.findElement(By.xpath("//select[@title='Month']"));
		Select mo=new Select(DoB_mo);
		mo.selectByIndex(4);
		
		WebElement DOB_yr = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select yr=new Select(DOB_yr);
		yr.selectByIndex(8);
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(1000);
		
		
		
		 driver.close();
}

	 
				
			
	 
	 public static void main(String[]args) throws InterruptedException, IOException
	 {
		 LaunchBrowser();
		 LaunchUrl();
		 Webelement();
		 Screnshot(); 
		 
	 
		// sign_up();
	 }
}
