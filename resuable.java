package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class resuable {
		WebDriver driver;
		public resuable(WebDriver d) {
		this.driver=d;
		
		}
		public void propmethod (String prop,String value)
		
		{
			driver.findElement(By.name(prop)).sendKeys(value);
		}

}
