package automationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import eeusableFunction.ReusableFunction;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookTest {
	ReusableFunction rs;
	WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		rs=new ReusableFunction();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void runfb()
	{
		try
		{
			WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
			WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
			WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
			rs.setValue(username, "9686928900");
			rs.setValue(pass, "9482436927");
			rs.click(login);
			TimeUnit.SECONDS.sleep(10);
			String actualTitle=driver.getCurrentUrl();
			String expectedurl="https://www.facebook.com/";
			Assert.assertEquals(expectedurl, actualTitle,"Assertion fails");
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
