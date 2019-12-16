package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindow {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gb152\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch url	
		driver.get("http://www.seleniumframework.com/Practiceform/");
		//String pagetitle= driver.getTitle();
		//System.out.println("new title is   "+pagetitle);
		driver.findElement(By.xpath("//*[@onclick=\"newBrwWin()\"]")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Set<String> newwindow =driver.getWindowHandles();
		
		for (String h : newwindow)
		{
			System.out.println("new title is   "+newwindow);
			driver.switchTo().window(h);
			String nwpagetitle= driver.getTitle();
			System.out.println("new title is   "+nwpagetitle);
			String search ="Ruby";
			
			int index = nwpagetitle.indexOf(search);
			if (index!= -1)
			{
				System.out.println("word  " +search + " found at index" + index );
			}
			else
			{
				System.out.println("word  " +search + " not found" );
			}
			
             String search1 ="Agile";
			
			int index1 = nwpagetitle.indexOf(search1);
			if (index1!= -1)
			{
				System.out.println("word  " +search1 + " found at index" + index1 );
			}
			else
			{
				System.out.println("word  " +search1 + " not found" );
			}
		}
		
		driver.quit();

	}

}
