package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	public static void enterProduct(WebDriver wd, String productName)			// Static methods. so, not need to use extends Keyword. for accessing this in other class.
	{
		/*WebElement name = wd.findElement(By.name("product"));					// Instead of these 2 lines we customize into 1 single line.
		name.sendKeys(productName);*/
		
		wd.findElement(By.name("product")).sendKeys(productName);
	}
	
	public static void enterMobileNumber(WebDriver wd, String mobileNumber)
	{
		wd.findElement(By.id("id1")).sendKeys(mobileNumber);
	}
	
	public static void enterEmailID(WebDriver wd, String emailID)
	{
		wd.findElement(By.id("id2")).sendKeys(emailID);
	}
	
	public static void productCategory(WebDriver wd)
	{
		WebElement dropdown = wd.findElement(By.id("id3"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Electrical");
	}
	
	public static void enterProductQuantity(WebDriver wd, String quantity)
	{
		wd.findElement(By.id("id4")).sendKeys(quantity);
	}
	
	public static void enterPurchaserName(WebDriver wd, String purchaserName)
	{
		wd.findElement(By.id("id5")).sendKeys(purchaserName);
	}
	
	public static void clickGST(WebDriver wd)
	{
		wd.findElement(By.id("idyes")).click();
	}
	
	public static void clickAvailablePayment(WebDriver wd)
	{
		wd.findElement(By.id("cod")).click();
	}
	
	public static void clickOrderButton(WebDriver wd)
	{
		wd.findElement(By.id("order")).click();
	}

}
