package com.Assignment;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instgram {

	@Test()
	public void run() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		List<WebElement> ls=driver.findElements(By.xpath(null));
		WebElement user=driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		Select select=new Select(login);
		Actions actio=new Actions(driver);
		Set<String> setd=driver.getWindowHandles();
		actio.click(login).perform();
		user.sendKeys("toralive6");
		pass.sendKeys("Abhishek@1999");
		login.click();
		TimeUnit.SECONDS.sleep(5);
		WebElement search=driver.findElement(By.xpath("//span[text()='Search']"));
		search.click();
		WebElement enterSerachName=driver.findElement(By.xpath("//input[@type='text']"));
		enterSerachName.sendKeys("toralive7");
		TimeUnit.SECONDS.sleep(5);
		WebElement toraProfile=driver.findElement(By.xpath("//span[text()='toralive7']"));
		toraProfile.click();
		TimeUnit.SECONDS.sleep(5);
		WebElement following=driver.findElement(By.xpath("//a[@href='/toralive7/followers/']"));
		following.click();
		TimeUnit.SECONDS.sleep(5);
		/*
		 * for(int i=0;i<10;i++) { WebElement
		 * dialog=driver.findElement(By.xpath("((//div[text()='Follow'])[2]"));
		 * JavascriptExecutor js =(JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click()", dialog); TimeUnit.SECONDS.sleep(10);
		 * }
		 */
		//JavascriptExecutor js =(JavascriptExecutor) driver;

		//js.executeScript("arguments[0].scrollBy(0, 200)", dialog);
		//js.executeScript("arguments[0].scrollTop = arguments[0].scrollHeight", dialog);
		
		Thread.sleep(5000);

		// 6. Follow some users from the followers list
	
		for (int i = 0; i < 1000; i++) {
			List<WebElement> followButtons = driver.findElements(By.xpath("(//div[text()='Follow'])[2]"));
			for (WebElement btn : followButtons) {
				try {
					btn.click();
					Thread.sleep(2000); // Delay to avoid bot detection
				} catch (Exception e) {
					continue;
				}
			}
			//WebElement followersPopup = driver.findElement(By.xpath("//div[@role='dialog']"));
		
			WebElement followersPopup= driver.findElement(By.xpath("//div[@class='x6nl9eh x1a5l9x9 x7vuprf x1mg3h75 x1lliihq x1iyjqo2 xs83m0k xz65tgg x1rife3k x1n2onr6']"));
			// Scroll down in the popup
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollTop + arguments[0].offsetHeight;", followersPopup);
			Thread.sleep(3000);
		}
		
		driver.close();
		driver.quit();
	}
	
}
