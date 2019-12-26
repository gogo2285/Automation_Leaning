package Selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch url	
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions action =new Actions(driver);
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action.doubleClick(drag);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		action.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(10000);
		driver.quit();
		

	}

}