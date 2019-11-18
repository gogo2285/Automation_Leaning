package Batch2.Batch2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class basicAnnoations {
	 WebDriver driver;
	
	
	@BeforeClass
	
	public static void first()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		
		System.out.println("before class");
	}
	
	@Before
	public  void launch()
	{	
		System.out.println("before test");
		driver = new ChromeDriver(); //launch url	
		driver.manage().window().maximize(); 
		
	}
	@Test
	public void test1()
	{
		driver.get("http://amazon.co.uk/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("electronics tool kit");
	    driver.findElement(By.className("nav-input")).click();
		//WebElement s= driver.findElement(By.xpath( "//*[@id=\"search\"]/div[1]/div[2]/div/span[4]/div[1]/div[30]/div/span"));
		//String j=s.getText();
		
	}
	
	@After
	
	public void close()
	
	{
		driver.close();
		System.out.println("after test");
	}
	
}



/*
@Test
public void test2()
{
	driver.get("http://google.com/");
	String s=driver.getTitle();
	System.out.println(s);
	System.out.println("test2 ran");
}
*/