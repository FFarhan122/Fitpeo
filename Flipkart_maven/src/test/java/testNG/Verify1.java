package testNG;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import pages.CartPage;
import pages.ProductsPage;
import pages.SingleProductDescriptionPage;

public class Verify1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		String expectedURL = "https://www.flipkart.com/";
		String actualURL   = driver.getCurrentUrl();
		String expectedTitleMessage = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String actualTitleMessage   = driver.getTitle();
		Assert.assertEquals(actualURL, expectedURL);
		Assert.assertEquals(actualTitleMessage, expectedTitleMessage);
		System.out.println("The verification of home page is Passed");
		
		WebElement el = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		el.sendKeys("laptop");
		el.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		ProductsPage productsPage = new ProductsPage(driver);
		productsPage.clickOnFirstProduct();
		

		ArrayList<String> allAddress = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(allAddress.get(1));
		System.out.println(driver.getCurrentUrl());
		
		SingleProductDescriptionPage singleProductDescriptionPage = new SingleProductDescriptionPage(driver);
		String priceOfProductInDetailsPage = singleProductDescriptionPage.getProductPrice();
		System.out.println(priceOfProductInDetailsPage);
		singleProductDescriptionPage.clickOnAddToCartButton(driver);
		singleProductDescriptionPage.clickOnCartLogo();
		
		CartPage cartPage = new CartPage(driver);
		String priceOfProductInCartPage = cartPage.getProductPrice();
		System.out.println(priceOfProductInCartPage);
		Assert.assertEquals(priceOfProductInDetailsPage, priceOfProductInCartPage);
		System.out.println("price of product in cart is Passed");
		

		
		
		
		
	}

}
