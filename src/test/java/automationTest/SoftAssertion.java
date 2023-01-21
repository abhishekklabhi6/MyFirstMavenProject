package automationTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	SoftAssert softAssert;
	@BeforeSuite
	public void beforeSuite()
	{
		 softAssert=new SoftAssert();
	}
	@Test
	
	public void test1()
	{
		String name="apple";
		softAssert.assertEquals(name, "aaa");
		System.out.println("script continue");
		softAssert.assertEquals(name, "apple");
		System.out.println("script end");
		softAssert.assertAll();
		
	}

}
