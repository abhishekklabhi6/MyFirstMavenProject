package com.Assignment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class InstagramAutomation {
	public static void main(String[] args) throws InterruptedException {
		// Setup
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// 1. Open Instagram and login
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);

		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		username.sendKeys("toralive6");
		password.sendKeys("Abhishek@1999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(8000); // wait for login + potential popups

		// 2. Handle "Save Your Login Info?" popup
		try {
			WebElement notNow = driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
			notNow.click();
		} catch (Exception e) {}

		Thread.sleep(3000);

		// 3. Handle Notifications popup
		try {
			WebElement notNow = driver.findElement(By.xpath("//button[contains(text(),'Not Now')]"));
			notNow.click();
		} catch (Exception e) {}

		Thread.sleep(3000);

		// 4. Search for a profile
		String profileToSearch = "toralive7"; // change as needed
		WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchBox.sendKeys(profileToSearch);
		Thread.sleep(3000);

		WebElement firstResult = driver.findElement(By.xpath("//div[@role='none']//a"));
		firstResult.click();

		Thread.sleep(5000);

		// 5. Click on "Followers"
		WebElement followersButton = driver.findElement(By.partialLinkText("followers"));
		followersButton.click();

		Thread.sleep(5000);

		// 6. Follow some users from the followers list
		WebElement followersPopup = driver.findElement(By.xpath("//div[@role='dialog']//div[@role='dialog']"));
		for (int i = 0; i < 10; i++) {
			List<WebElement> followButtons = driver.findElements(By.xpath("//button[text()='Follow']"));
			for (WebElement btn : followButtons) {
				try {
					btn.click();
					Thread.sleep(2000); // Delay to avoid bot detection
				} catch (Exception e) {
					continue;
				}
			}

			// Scroll down in the popup
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollTop = arguments[0].scrollTop + arguments[0].offsetHeight;", followersPopup);
			Thread.sleep(3000);
		}

		System.out.println("Followed users successfully.");
		driver.quit();
	}
}


