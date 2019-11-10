package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch url	
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[(text()=\"Click me to start timer\")]")).click();
		
		//IMPLICIT WAIT
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		//WebElement s= driver.findElement(By.xpath("//p[@id=\"demo\"]"));//--- another way of writing xpath
		WebElement s= driver.findElement(By.xpath("//p[text()=\"WebDriver\"]"));
		System.out.println(s.getText());*/
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[text()=\"WebDriver\"]")));	
		WebElement s= driver.findElement(By.xpath("//p[text()=\"WebDriver\"]"));
		System.out.println(s.getText());

	}

}
