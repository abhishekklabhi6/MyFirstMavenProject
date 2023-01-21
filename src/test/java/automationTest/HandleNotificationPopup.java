package automationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleNotificationPopup {
	
	@Test
	public void run()
	{
		try
		{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9686928900");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9482436927");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		TimeUnit.SECONDS.sleep(20);
		driver.quit();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

}
