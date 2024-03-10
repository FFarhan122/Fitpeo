package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SingleProductDescriptionPage
{
	@FindBy(xpath = "(//div[contains(@class,'_1AtVbE col-12')]/descendant::button[contains(@class,'_2KpZ6l _2U9uOA ')])[1]")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//div[@class='_1psGvi']//span")
	private WebElement cartLogo;
	
	@FindBy(xpath = "(//div[contains(@class,'_1AtVbE col-12-12')]/descendant::div[@class='CEmiEU']//div[1])[2]")
	private WebElement productPrice;
	
	public SingleProductDescriptionPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddToCartButton(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
		addToCartButton.click();
	}
	
	public void clickOnCartLogo()
	{
		cartLogo.click();
	}
	
	public String getProductPrice()
	{
		String price = productPrice.getText();
		return price;
	}

}
