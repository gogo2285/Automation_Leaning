package testNg;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite test 1");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test 1 ");
	}
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before class 1");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("before method 1");
	}
	
	@Test
	
	public void mainTest()
	{
		System.out.println("main test 1");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite test 1");
	}
	
	@AfterTest
	public void Aftertest()
	{
		System.out.println("after test 1 ");
	}
	
	@AfterClass
	public void Afterclass()
	{
		System.out.println("after class 1");
	}
	
	@AfterMethod

	public void aftermethod()
	{
		System.out.println("after method 1");
	}

}
