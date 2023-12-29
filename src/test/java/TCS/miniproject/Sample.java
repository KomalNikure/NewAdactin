package TCS.miniproject;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	 static WebDriver driver;
	public static void browserLaunch() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		//driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		
		//driver.manage().window().maximize();
//		options.addArguments("start-maximized");
//		options.addArguments("incognito");
		
		List<String>opt=new ArrayList<String>();
		opt.add("start-maximized");
		opt.add("incognito");
		options.addArguments(opt);
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	} 
	 
	public static  void urllaunch()
	{
		driver.get("https://adactinhotelapp.com/");
	}
		
	public static void logIn() 
	{
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("komnikure");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("nik2703");
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).click();
	}
	
	 public static void selectDropdown()
	 {
		 WebElement dropdown = driver.findElement(By.xpath("//select[contains(@name,'location')]"));
		 Select s=new Select(dropdown);
		 s.selectByIndex(2);
		 
		 WebElement selecthotel = driver.findElement(By.xpath("//select[contains(@name,'hotels')]"));
			Select s1=new Select(selecthotel);
			s1.selectByValue("Hotel Creek");
			
			WebElement room= driver.findElement(By.xpath("//select[contains(@name,'room_type')]"));
			Select s2=new Select(room);
			s2.selectByVisibleText("Super Deluxe");
			
			WebElement roomno = driver.findElement(By.xpath("//select[@name='room_nos']"));
			Select s3=new Select(roomno);
			s3.selectByIndex(2);
			
			WebElement adultroom = driver.findElement(By.xpath("//select[contains(@name,'adult_room')]"));
			Select s4=new Select(adultroom);
			s4.selectByIndex(3);
			
			WebElement childroom = driver.findElement(By.xpath("//select[contains(@name,'child_room')]"));
			Select s5=new Select(childroom);
			s5.selectByIndex(3);
	 }
	 
	public static void WebElement()
	{
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
        
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("komal");
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("xyzss");
		
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("chennai");
		
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("7896321458963256");
		
	}
	
	public static void Dropdown() throws InterruptedException 
	{
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6=new Select(cctype);
		s6.selectByIndex(2);
		
		WebElement ccmonth = driver.findElement(By.xpath("//select[contains(@name,'cc_exp_month')]"));
		Select s7=new Select(ccmonth);
		s7.selectByIndex(2);
		
		WebElement ccyear = driver.findElement(By.xpath("//select[contains(@name,'cc_exp_year')]"));
		Select s8=new Select(ccyear);
		s8.selectByIndex(4);
		
		
		driver.findElement(By.xpath("//input[contains(@name,'cc_cvv')]")).sendKeys("123");
		
		
		
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(2000);
		
		

	}
	
	public static void internery() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[contains(@name,'my_itinerary')]")).click();
		Thread.sleep(1000);
	}
	
	public static void logout() throws InterruptedException {
		driver.findElement(By.xpath("//input[(@value='Logout')]")).click();
		Thread.sleep(1000);

	}
	
		

	public static void main(String[] args) throws InterruptedException {
		browserLaunch();
		urllaunch();
		logIn();
		selectDropdown();
		WebElement();
		Dropdown();
		internery();
		logout();
		
		
	}
}
