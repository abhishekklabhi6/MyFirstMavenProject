package pageObectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class SignInpageForShop {
	
	WebDriver driver;
	
	public SignInpageForShop(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement loginLink;
	
	public void clickLoginButton()
	{
		loginLink.click();
		Assert.assertEquals(driver.getTitle(), "Login - My Store","login page is not open");
		Reporter.log("Login page is scussfully opened", true);
	}
}
