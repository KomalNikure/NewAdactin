package TCS.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange_hrm {
 static WebDriver driver;
	public static void LaunchBrowser() 
	{
      WebDriverManager.chromedriver().setup();
      ChromeOptions options=new ChromeOptions();
//      options.addArguments("start-maximized");
//      options.addArguments("incognito");
      
      List<String>opt=new ArrayList<String>();
      opt.add("start-maximized");
      opt.add("incognito");
      options.addArguments(opt);
      driver=new ChromeDriver(options);  
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void LauchUrl() 
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	public static void Login() 
	{
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin"); 
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
		
	public static void scrolldown() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,2000)");
		
	}
	
	public static void Myinfo () throws InterruptedException 
	{
         driver.findElement(By.xpath("//span[text()='My Info']")).click();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
	}
	
	public static void Screenshot() throws IOException {
		TakesScreenshot ref = (TakesScreenshot)driver;
		File source =ref.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Home\\eclipse-workspace\\Selenium_project\\screenshot\\success.png");
		FileUtils.copyFile(source,des);
	}
	
	public static void Clickprofile() 
	{
		 WebElement log = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		 log.click();
	}
	
	public static void Logout() throws InterruptedException 
	{
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 Thread.sleep(2000);
	}
	public static void main(String[]args) throws InterruptedException, IOException 
	{
		LaunchBrowser();
		LauchUrl();
		Login() ;
		scrolldown();
		Myinfo ();
		Screenshot() ;
		Clickprofile();
		Logout();
	}
	
	
}
