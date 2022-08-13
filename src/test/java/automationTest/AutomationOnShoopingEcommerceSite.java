package automationTest;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObectModel.PersonalInformationPage;
import pageObectModel.RegestrationPage;
import pageObectModel.SignInpageForShop;

public class AutomationOnShoopingEcommerceSite {
	WebDriver driver;
	SignInpageForShop signInpageForShop;
	RegestrationPage regestrationPage;
	PersonalInformationPage personalInformationPage;
	@BeforeSuite
	public void beforeSuite()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		signInpageForShop=PageFactory.initElements(driver, SignInpageForShop.class);
		regestrationPage=PageFactory.initElements(driver, RegestrationPage.class);
		personalInformationPage=PageFactory.initElements(driver, PersonalInformationPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
	}
	@DataProvider(name="emailid0")
	public static Object[][] getTestData() throws Exception
	{
		String path="C:\\Users\\User\\eclipse-workspace\\MyMavenProject\\src\\test\\resources\\TestData\\Book1.xlsx";
		FileInputStream fin=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fin);
		Sheet sheet=wb.getSheet("Sheet2");
		int rowCount=sheet.getPhysicalNumberOfRows();
		int cellCount=sheet.getRow(0).getPhysicalNumberOfCells();
		Object ob[][]=new Object[rowCount][cellCount];
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				ob[i][j]=sheet.getRow(i).getCell(j).getStringCellValue().toString();
			}
		}
		return ob;
	}	
	
	@Test(dataProvider="emailid0")
	
	public void shoopingOneProduct(String email,String firstName,String lastName,String Password) 
	{
		try
		{
			System.out.println(driver.getTitle());
			signInpageForShop.clickLoginButton();
			regestrationPage.setEmailid(email);
			TimeUnit.SECONDS.sleep(3);
			regestrationPage.clickCreateAccountLink();
			personalInformationPage.enterInformation(firstName, lastName, Password);
			TimeUnit.SECONDS.sleep(20);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterSuite
	public void afterSuite()
	{
		driver.quit();
	}
}
