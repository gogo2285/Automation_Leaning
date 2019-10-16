//to open a url 

package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Demotest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	    String title = driver.getTitle();
	    System.out.println("the title of page is  " + title);
		driver.get("http://newtours.demoaut.com/");
		WebElement username = driver.findElement(By.name("userName"));
		username.sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		WebElement dropdown = driver.findElement(By.name("fromPort"));
		Select countrydropdown = new Select(dropdown);
		countrydropdown.selectByValue("Paris");
		/*WebElement month = driver.findElement(By.name("fromMonth"));
		Select monthlist = new Select(month);
		monthlist.selectByValue("November");*/
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Gayatri");
		driver.findElement(By.name("passLast0")).sendKeys("Bhagwani");
		driver.findElement(By.name("creditnumber")).sendKeys("1234567891234567");
		driver.findElement(By.name("buyFlights")).click();
		/*WebElement confnumber= driver.findElement(By.linkText("Flight Confirmation #."));
		String s =confnumber.getText();
		System.out.println(s);*/
			driver.close();
	}

}
