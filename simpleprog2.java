package Selenium;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class simpleprog2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch url
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");
	    Thread.sleep(3000);
	    driver.findElement(By.id("firstName")).sendKeys("gayatri");
	    driver.findElement(By.id("lastName")).sendKeys("bhagwani");
	    driver.findElement(By.id("username")).sendKeys("atbtescd2");
	    driver.findElement(By.name("Passwd")).sendKeys("computer@22");
	    driver.findElement(By.name("ConfirmPasswd")).sendKeys("computer@22");
	    Thread.sleep(3000);
	    driver.findElement(By.id("accountDetailsNext")).click();
	    Thread.sleep(5000);
	   /* WebElement country= driver.findElement(By.xpath("//*[@id=\"countryList\"]/div[1]/div[1]/div[1]/div[1]"));
	    Select select = new Select(country);
	    select.selectByVisibleText("United Kingdom");*/
	  //  driver.findElement(By.xpath("//*[@id=\"countryList\"]/div[1]/div[2]")).click();
	   /* WebElement country= driver.findElement(By.xpath("//div[@role=\"listbox\"][@id=\"countryList\"]"));
	    Select select = new Select(country);
	    select.selectByVisibleText("India");*/
	   // select.selectByIndex(99);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"phoneNumberId\"]")).sendKeys("07501018128");
	   // driver.findElement(By.id("phoneNumberId")).sendKeys("0750108127");
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.findElement(By.id("gradsIdvPhoneNext")).click();
	    System.out.println(" enter the code from google");
	    Scanner scan = new Scanner(System.in);
	    //System.out.println(" enter the code from google");
	    String code= scan.nextLine();
	    Thread.sleep(20000);
	    driver.findElement(By.name("code")).sendKeys(code);	//------------------ask how to automate this ?
	    //driver.findElement(By.xpath("//*[@id=\"gradsIdvVerifyNext\"]/div[2]")).click();
	    Thread.sleep(10000);
		driver.findElement(By.id("gradsIdvVerifyNext")).click();
		
	    
	    
	   // driver.quit();
	}

}
