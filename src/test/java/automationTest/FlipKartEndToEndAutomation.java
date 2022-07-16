package automationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import eeusableFunction.ReusableFunction;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartEndToEndAutomation {
	
	ReusableFunction rs;
	WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		rs=new ReusableFunction();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void runfb()
	{
		try
		{
			TimeUnit.SECONDS.sleep(10);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	@AfterSuite
	public void afterSuite()
	{
		driver.quit();
	}
}

