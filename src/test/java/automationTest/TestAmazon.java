package automationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObectModel.AmazonPage;

public class TestAmazon {
	WebDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}

	//@Test
	public void runTC1()
	{
		try {
			driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
			driver.findElement(By.id("ap_email")).sendKeys("7019742573");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("Abhishek@1998");
			driver.findElement(By.id("signInSubmit")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
			driver.findElement(By.id("nav-search-submit-button")).click();
			driver.findElement(By.xpath("//div[@class='a-section']/descendant::a[1]")).click();
			WebElement price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
			String relaPrice=price.getText();
			System.out.println("IphonePrice Rs : "+relaPrice);
			Reporter.log("price displayed succesfully",true);
		}
		catch(Exception e)
		{
			e.getCause();
			e.printStackTrace();
		}
	}

	@Test
	public void runthroughPageFactory()
	{
		try 
		{
			AmazonPage amazonPage=PageFactory.initElements(driver, AmazonPage.class);
			amazonPage.displayProductPrice();
		}

		catch(Exception e)
		{
			e.getCause();
			e.printStackTrace();
		}
	}

	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
