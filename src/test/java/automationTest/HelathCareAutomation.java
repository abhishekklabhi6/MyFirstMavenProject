package automationTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import eeusableFunction.ReusableFunction;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HelathCareAutomation {
	@Test(invocationCount=3,threadPoolSize=3)
	public void chromeRun()
	{
		try
		{
		ReusableFunction rs=new ReusableFunction();
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://katalon-demo-cura.herokuapp.com/");
	WebElement makappointlink=driver.findElement(By.xpath("//a[text()='Make Appointment']"));
	rs.click(makappointlink);
	WebElement usernamenamefiled=driver.findElement(By.id("txt-username"));
	WebElement passwordfield=driver.findElement(By.id("txt-password"));
	WebElement loginlink=driver.findElement(By.xpath("//button[text()='Login']"));
	rs.setValue(usernamenamefiled, "John Doe");
	rs.setValue(passwordfield, "ThisIsNotAPassword");
	rs.click(loginlink);
	WebElement dropdown=driver.findElement(By.xpath("//select[@id='combo_facility']"));
	Select select=new Select(dropdown);
	select.selectByValue("Seoul CURA Healthcare Center");
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']"));
	rs.click(checkbox);
	WebElement radio=driver.findElement(By.xpath("//input[@value='None']"));
	rs.click(radio);
	WebElement claender=driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-calendar']"));
	rs.click(claender);
	List<WebElement> claenderlist=driver.findElements(By.xpath("//th[@class='prev']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	for(int i=0;i<claenderlist.size()-3;i++)
	{
		WebElement selectdate=claenderlist.get(i);
		TimeUnit.SECONDS.sleep(1);
		js.executeScript("arguments[0].click();", selectdate);
		WebElement value=driver.findElement(By.xpath("//td[text()='10']"));
		TimeUnit.SECONDS.sleep(1);
		rs.click(value);
	}
	WebElement comment=driver.findElement(By.id("txt_comment"));
	rs.setValue(comment, "ThisIsNotAPassword");
	WebElement book=driver.findElement(By.xpath("//button[text()='Book Appointment']"));
	rs.click(book);
	TimeUnit.SECONDS.sleep(5);
	driver.quit();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	
	}
}

