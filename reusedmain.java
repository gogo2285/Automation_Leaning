package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reusedmain {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); //launch url	
		resuable r = new resuable(driver);
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		Properties p=new Properties();
		FileInputStream I = new FileInputStream("D:\\java\\GB\\Batch1\\src\\test\\resources\\testproperties\\objectrepository");
		p.load(I);
		System.out.println(p.getProperty("user_name"));
		//r.propmethod("userName", "tutorial");
		//r.propmethod("password", "tutorial");
		
		r.propmethod(p.getProperty("user_name"), "tutorial");
		r.propmethod(p.getProperty("password_name"), "tutorial");
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
