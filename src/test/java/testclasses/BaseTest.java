package testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import pages.AmazonSignin;

public class BaseTest
{
	
	static WebDriver driver;
	 AmazonSignin  sign ;
	@BeforeSuite
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
	@BeforeClass
	public void createObject()
	{
		sign=new AmazonSignin(driver);
	}
}
