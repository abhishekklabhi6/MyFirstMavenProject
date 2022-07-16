package eeusableFunction;

import org.openqa.selenium.WebElement;

public class ReusableFunction {
	
	public void click(WebElement ele)
	{
		ele.click();
	}

	public void setValue(WebElement ele,String value)
	{
		ele.sendKeys(value);
	}
}
