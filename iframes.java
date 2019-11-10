package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch url	
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		int i = driver.findElements(By.tagName("iframe")).size();
		System.out.println("the total no. of frames is " +i);
		WebElement j= driver.findElement(By.xpath("//iframe[@src='https:/www.youtube.com/embed/RbSlW8jZFe8']"));
		driver.switchTo().frame(j);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
		Thread.sleep(10000);
		driver.switchTo().defaultContent();

}
}