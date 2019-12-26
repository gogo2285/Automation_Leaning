package seleniumglucode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinition {
	
	WebDriver driver;
	
	
	@Given("^: browser is present$")
	public void browser()
	{
		System.out.println("1");
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		driver = new ChromeDriver(); //launch url	
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		
	}
	
	@When("^: user logs in with \"(.*)\" and \"(.*)\"$")
	public void login(String username, String password) throws Exception
	{
		System.out.println("2");
		//Thread.sleep(10000);
		driver.findElement(By.name("userName")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
	}
	@And("^: Flight ticket is booked successfully for both ways$")
	public void booked() throws Exception
	{
		System.out.println("3");
		//Thread.sleep(5000);
		WebElement fromport = driver.findElement(By.name("fromPort")) ;
		Select fromport1 = new Select(fromport);
		fromport1.selectByValue("London");
		WebElement frommon = driver.findElement(By.name("fromMonth")) ;
		Select frommon1 = new Select(frommon);
		frommon1.selectByVisibleText("November");
		WebElement fromd = driver.findElement(By.name("fromDay")) ;
		Select frompd1 = new Select(fromd);
		frompd1.selectByVisibleText("19");
		WebElement toPort = driver.findElement(By.name("toPort")) ;
		Select toPort1 = new Select(toPort);
		toPort1.selectByValue("Frankfurt");
		WebElement tommon = driver.findElement(By.name("toMonth")) ;
		Select tomon1 = new Select(tommon);
		tomon1.selectByVisibleText("December");
		WebElement tomd = driver.findElement(By.name("toDay")) ;
		Select topd1 = new Select(tomd);
		topd1.selectByVisibleText("29");
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Gayatri");
		driver.findElement(By.name("passLast0")).sendKeys("Bhagwani");
		driver.findElement(By.name("creditnumber")).sendKeys("1234567891234567");
		driver.findElement(By.name("buyFlights")).click();
		
	}
	@Then("^: Confirmation no. is printed successfully$")
	public void confno()
	{
		System.out.println("4");
		WebElement confno=driver.findElement(By.xpath("//font[contains(text(),\"Flight\")]"));
		String s= confno.getText();
		System.out.println("confirmation no. is" + s);
		//driver.close();
		
	}
	@When("^: Flight ticket is booked successfully for one way$")
	public void bookedoneway() throws Exception
	{
		System.out.println("3a");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value=\"oneway\"]")).click();
		WebElement fromport = driver.findElement(By.name("fromPort")) ;
		Select fromport1 = new Select(fromport);
		WebElement frommon = driver.findElement(By.name("fromMonth")) ;
		Select frommon1 = new Select(frommon);
		WebElement fromd = driver.findElement(By.name("fromDay")) ;
		Select frompd1 = new Select(fromd);
		fromport1.selectByValue("London");
		frommon1.selectByIndex(11);	
		frompd1.selectByVisibleText("20");
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("malini");
		driver.findElement(By.name("passLast0")).sendKeys("Arya");
		driver.findElement(By.name("creditnumber")).sendKeys("1234567891234567");
		driver.findElement(By.name("buyFlights")).click();
		
	}

	@And("^: close the browser$")
	public void close()
	{
		driver.quit();
	
	}
}
