package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage 
{
	@FindBy(xpath = "(//div[@class='_2kHMtA']//a/descendant::div[@class='_4rR01T'])[1]")
	private WebElement firstProduct;

	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnFirstProduct()
	{
		firstProduct.click();
	}
}
//(//div[@class='_2kHMtA']//a/descendant::div[@class='_4rR01T'])[1]