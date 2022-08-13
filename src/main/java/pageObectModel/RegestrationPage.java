package pageObectModel;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegestrationPage {
	
WebDriver driver;
	
	public RegestrationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement emailIdtextBox;
	
	@FindBy(xpath="//i[@class='icon-user left']")
	private WebElement createAccountLink;
	
	public void setEmailid(String emailfromUser)
	{
		emailIdtextBox.sendKeys(emailfromUser);
	}
	
	public void clickCreateAccountLink()
	{
		try
		{
		createAccountLink.click();
		}
		catch(ElementNotInteractableException e)
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",createAccountLink);
		}
		
	}
}
