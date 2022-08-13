package automationTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserHandling {

	@Test

	public void runTest()
	{
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Load the website
		driver.get("http://www.naukri.com/");

		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();

		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		//Iterator<String> I1= s.iterator();

		for(String child:s)
		{

			String child_window=child;


			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				System.out.println("child window");
				driver.quit();
			}

		}
		System.out.println("parent winow : "+driver.switchTo().window(parent));

		driver.quit();
	}
}
