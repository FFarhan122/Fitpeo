package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//input[@title='Search for Products, Brands and More']")
	private WebElement searchBar;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchBar(String name)
	{
		searchBar.sendKeys(name);
		searchBar.sendKeys(Keys.ENTER);
	}
}
