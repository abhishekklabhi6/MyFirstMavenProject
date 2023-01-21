package automationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewWindow {

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
		  driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#");
		  //WebElement iframe=driver.findElement(By.xpath("//iframe[@id='google_esf']"));
		 // driver.switchTo().frame(iframe);
		 
		driver.findElement(By.xpath("//div[@rel-title='Open New Tab']/child::a[text()='Click Here']")).click();
		TimeUnit.SECONDS.sleep(20);
		driver.quit();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}

}
