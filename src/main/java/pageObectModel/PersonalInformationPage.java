package pageObectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class PersonalInformationPage {
	
	WebDriver driver;
	
	public PersonalInformationPage(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(id="id_gender1")
	private WebElement radioTitile;
	@FindBy(id="customer_firstname")
	private WebElement tesboxFirstname;
	@FindBy(id="customer_lastname")
	private WebElement tesboxLasttname;
	@FindBy(id="passwd")
	private WebElement tesboxPassword;
	@FindBy(id="email")
	private WebElement tesboxEmail;
	
	public void enterInformation(String FirstName,String LastName,String Password)
	{
		radioTitile.click();
		tesboxFirstname.sendKeys(FirstName);
		tesboxLasttname.sendKeys(LastName);
		tesboxPassword.sendKeys(Password);
		Assert.assertEquals(driver.getTitle(),"Login - My Store","information page not present");
		Reporter.log("information page present successfully",true);
	}
	
	
}
