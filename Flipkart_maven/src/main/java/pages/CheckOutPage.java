package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage 
{
	@FindBy(xpath = "//input[@autocomplete='off']")
	private WebElement textField;
	
	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sendMobileNumber(String num)
	{
		textField.sendKeys(num);
	}

}
