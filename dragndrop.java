package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Locatable;

public class dragndrop {
public static void main(String[] args) throws Exception {
		
	    System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch url	
		driver.get("http://www.seleniumframework.com/Practiceform/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Actions action =new Actions(driver);
		WebElement drag = driver.findElement(By.id("draga"));
		//WebElement drag = driver.findElement(By.xpath("//*[@id=\"draga\"]"));
		WebElement drop = driver.findElement(By.id("dragb"));
		WebElement message = driver.findElement(By.name("message"));
		//action.contextClick(drag);
		
		action.doubleClick(drag);
		//drag.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		/*action.contextClick(drop);
		Thread.sleep(3000);*/
		//action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		action.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(10000);
		driver.quit();
		/*Locatable dragele=(Locatable) drag;
		int x = dragele.getCoordinates().onScreen().getX();
		int y = dragele.getCoordinates().onScreen().getX();	*/
		
		//action.dragAndDropBy(drag, x, y).perform();
		

}
}
