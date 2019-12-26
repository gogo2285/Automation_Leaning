package Selenium;

import java.util.List;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simpleprog1 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\java\\GB\\Selenium_Practise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch url
		driver.manage().window().maximize();
		driver.get("http://google.com/");
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("java");
		Thread.sleep(3000);

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li[@class=\"sbct\"]/descendant::div[@class='sbl1']"));

		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println("result of search is  " + list.get(i).getText());
		}
		list.get(0).click();
		Thread.sleep(3000);
		// list.get(0).getTagName();
		// System.out.println(list.get(0).getTagName()+ " aaaaaaaaaa");
		// driver.findElement(By.linkText("Download Free Java Software")).click();
		// List<WebElement> list1=
		driver.findElement(By.xpath("\r\n" + "//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
		// list.get(0).click();
		String s = driver.getTitle();
		System.out.println(s);
		if (s == "Download Free Java Software") {
			System.out.println("strings matched");
		} else {
			System.out.println("strings dont match");
		}

		driver.quit();
	}

}
