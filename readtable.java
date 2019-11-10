package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class readtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch url	
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		String s1= "//*[@id='leftcontainer']/table/tbody/tr[";
		String s2="]/td[";
		String s3="]";
		String s5="/a";
		//int j=1;
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		int size= rows.size();
		
		System.out.println("size is" + size);
		
		for (int i=1;i<=size;i++)
					{
			
			for ( int j=2;j<6;j++)
			{
				String s4 =s1+i+s2+j+s3;
			WebElement e= driver.findElement(By.xpath(s4));
			System.out.println("element at row"  + i  + "and column" +j+ "is  " + e.getText());
			 s4 =s1+i+s2+j+s3;
			}
			
					}
driver.close();
	}

}
