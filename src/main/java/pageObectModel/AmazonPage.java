package pageObectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AmazonPage {
	WebDriver driver;
	@FindBy(xpath="//span[text()='Hello, sign in']")
	private WebElement SignInmouseHower;
	
	@FindBy(id="ap_email")
	private WebElement phoneNumberTextbox;
	
	@FindBy(id="continue")
	private WebElement ButtonContinue;
	
	@FindBy(id="ap_password")
	private WebElement passwordTextbox;
	
	@FindBy(id="signInSubmit")
	private WebElement signInButton;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchButton;
	
	@FindBy(xpath="//div[@class='a-section']/descendant::a[1]")
	private WebElement anyFirstproduct;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	private WebElement TextPrice;
	
	public void displayProductPrice()
	{
		try
		{
		SignInmouseHower.click();
		phoneNumberTextbox.sendKeys("7019742573");
		ButtonContinue.click();
		passwordTextbox.sendKeys("Abhishek@1998");
		signInButton.click();
		searchbox.sendKeys("iphone14");
		searchButton.click();
		anyFirstproduct.click();
		System.out.println(TextPrice.getText());
		Reporter.log("price displayed succesfully",true);
		}
		catch(Exception e)
		{
			e.getCause();
			e.printStackTrace();
		}
	}

}
