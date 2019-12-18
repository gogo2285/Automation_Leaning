package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	
		public static void main(String[] args) throws Exception {
			//System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gb152\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); //launch url	
			driver.manage().window().maximize();
			driver.get("http://demo.guru99.com/test/guru99home/");
			int i = driver.findElements(By.tagName("iframe")).size();
			System.out.println("the total no. of frames is " +i);
			WebElement j= driver.findElement(By.xpath("//*[@id=\"rt-showcase\"]/div/div[1]/div/div/div/div/div[2]/div/div/iframe"));
			driver.switchTo().frame(j);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();
			Thread.sleep(10000);
			driver.switchTo().defaultContent();
			driver.quit();
			

	}

	}


