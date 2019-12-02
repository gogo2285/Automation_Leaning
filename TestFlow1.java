package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFlow1 {
WebDriver driver;   /// declared here so that it is available in all methods of class
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite test 1");
	}

	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test 1 ");
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}
	
		
	@Test(priority=2)
	
	public void FlowTest1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch url	
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		WebElement fromport = driver.findElement(By.name("fromPort")) ;
		Select fromport1 = new Select(fromport);
		WebElement frommon = driver.findElement(By.name("fromMonth")) ;
		Select frommon1 = new Select(frommon);
		WebElement fromd = driver.findElement(By.name("fromDay")) ;
		Select frompd1 = new Select(fromd);
		fromport1.selectByValue("London");
		frommon1.selectByIndex(11);	
		frompd1.selectByVisibleText("19");
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Gayatri");
		driver.findElement(By.name("passLast0")).sendKeys("Bhagwani");
		driver.findElement(By.name("creditnumber")).sendKeys("1234567891234567");
		driver.findElement(By.name("buyFlights")).click();
		WebElement confno=driver.findElement(By.xpath("//font[contains(text(),\"Flight\")]"));
		String s= confno.getText();
		System.out.println("confirmation no. is" + s);
				
		System.out.println("main test 1 executed successfully");
	}
	
	@Test(priority=1)

	public void FlowTest2()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch url	
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		WebElement fromport = driver.findElement(By.name("fromPort")) ;
		Select fromport1 = new Select(fromport);
		WebElement frommon = driver.findElement(By.name("fromMonth")) ;
		Select frommon1 = new Select(frommon);
		WebElement fromd = driver.findElement(By.name("fromDay")) ;
		Select frompd1 = new Select(fromd);
		fromport1.selectByValue("London");
		frommon1.selectByIndex(11);	
		frompd1.selectByVisibleText("19");
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("malini");
		driver.findElement(By.name("passLast0")).sendKeys("arya");
		driver.findElement(By.name("creditnumber")).sendKeys("9234567891234569");
		driver.findElement(By.name("buyFlights")).click();
		WebElement confno=driver.findElement(By.xpath("//font[contains(text(),\"Flight\")]"));
		String s= confno.getText();
		System.out.println("confirmation no. for second traveller is   " + s);
				
		System.out.println("main test 2 executed successfully");
	}
	
@Test(priority=0)

public void FlowTest3()
{
	System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); //launch url	
	driver.manage().window().maximize();
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys("tutorial");
	driver.findElement(By.name("password")).sendKeys("tutorial");
	driver.findElement(By.name("login")).click();
	WebElement fromport = driver.findElement(By.name("fromPort")) ;
	Select fromport1 = new Select(fromport);
	WebElement frommon = driver.findElement(By.name("fromMonth")) ;
	Select frommon1 = new Select(frommon);
	WebElement fromd = driver.findElement(By.name("fromDay")) ;
	Select frompd1 = new Select(fromd);
	fromport1.selectByValue("London");
	frommon1.selectByIndex(11);	
	frompd1.selectByVisibleText("19");
	driver.findElement(By.name("findFlights")).click();
	driver.findElement(By.name("reserveFlights")).click();
	driver.findElement(By.name("passFirst0")).sendKeys("pihu");
	driver.findElement(By.name("passLast0")).sendKeys("hirani");
	driver.findElement(By.name("creditnumber")).sendKeys("1234567891238888");
	driver.findElement(By.name("buyFlights")).click();
	WebElement confno=driver.findElement(By.xpath("//font[contains(text(),\"Flight\")]"));
	String s= confno.getText();
	System.out.println("confirmation no. for third traveller is  " + s);
			
	System.out.println("main test 3 executed successfully");
}


	
	@AfterMethod
	public void Afterclass()
	{
		driver.close();
		System.out.println("after method 1");
	}
	@AfterSuite
	public void aftersuite()
	{
		driver.quit();
	}
	
	
}
