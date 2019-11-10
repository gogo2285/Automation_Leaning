package Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class objRep {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver(); //launch url	
		//driver.manage().window().maximize();
		//driver.get("http://newtours.demoaut.com/");
		Properties p= new Properties();
		FileInputStream I = new FileInputStream("D:\\java\\GB\\Batch1\\src\\test\\resources\\testproperties\\objectrepository");
		p.load(I);
		System.out.println(p.getProperty("user_name"));
		System.out.println(p.getProperty("password_name"));
		System.out.println(p.getProperty("login_name"));
		

	}

}
