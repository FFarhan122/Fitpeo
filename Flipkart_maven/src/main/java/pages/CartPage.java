package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage
{
	@FindBy(xpath = "(//div[@class = '_I_XQO']/descendant::div[@class='z4Ha90'])[1]")
	private WebElement productPrice;
	
	@FindBy(xpath = "//span[text()='Place Order']")
	private WebElement placeOrderButton;
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public String getProductPrice()
	{
		return productPrice.getText();
	}
	public void clickOnPlaveOrderButton()
	{
		placeOrderButton.click();
	}

}
