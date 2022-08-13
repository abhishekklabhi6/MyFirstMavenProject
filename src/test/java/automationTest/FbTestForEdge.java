package automationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbTestForEdge {
	@Parameters({"browserName"})
	@Test
	public void runfb(String browserName)
	{
		try
		{

			if(browserName.equals("edge"))
			{
				WebDriverManager.edgedriver().setup();
				WebDriver driver=new EdgeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
				WebElement pass=driver.findElement(By.xpath("//input[@name='pass']"));
				WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
				username.sendKeys("9686928900");
				pass.sendKeys("9482436927");
				login.click();
				String actualTitle=driver.getCurrentUrl();
				String expectedurl="https://www.facebook.com/";
				Assert.assertEquals(expectedurl, actualTitle,"Assertion fails");
				TimeUnit.SECONDS.sleep(5);
				driver.quit();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
