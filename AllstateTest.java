package javaPrograms;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllstateTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		int count=0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		String timestamp=LocalDateTime.now().toString().replace(':','-');
		String path="./src/main/resources/Screenshot/amazon"+timestamp+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sour=ts.getScreenshotAs(OutputType.FILE);
		File des=new File(path);
		FileUtils.copyFile(sour, des);
		for(WebElement link:allLinks)
		{
			count++;
			System.out.println(link.getText());
		}
		System.out.println("Totoal link present in this page : "+count);
		driver.quit();
	}

}
