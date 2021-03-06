package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
	public static By Product_Name		 = By.name("product");
	public static By Mobile_Number 		 = By.id("id1");
	public static By Email_ID			 = By.id("id2");
	public static By Product_Category	 = By.id("id3");
	public static By Product_Quantity	 = By.id("id4");
	public static By Purchaser_Name 	 = By.id("id5");
	public static By Click_GST			 = By.id("idyes");
	public static By Available_Payment   = By.id("cod");
	public static By Order_Button 		 = By.id("order");
	
	public static void enterProduct(WebDriver wd, String productName)			// Static methods. so extends Keyword. for accessing this in other class.
	{
		//	wd.findElement(By.name("product")).sendKeys(productName);		// Instead of this line. We r using next line.
		
		// classsName.variableName
		
		wd.findElement(ProductPage.Product_Name).sendKeys(productName);
		
	}
	
	public static void enterMobileNumber(WebDriver wd, String mobileNumber)
	{
		wd.findElement(ProductPage.Mobile_Number).sendKeys(mobileNumber);
	}
	
	public static void enterEmailID(WebDriver wd, String emailID)
	{
		wd.findElement(ProductPage.Email_ID).sendKeys(emailID);
	}
	
	public static void productCategory(WebDriver wd)
	{
		WebElement dropdown = wd.findElement(ProductPage.Product_Category);
		Select s = new Select(dropdown);
		s.selectByVisibleText("Electrical");
	}
	
	public static void enterProductQuantity(WebDriver wd, String quantity)
	{
		wd.findElement(ProductPage.Product_Quantity).sendKeys(quantity);
	}
	
	public static void enterPurchaserName(WebDriver wd, String purchaserName)
	{
		wd.findElement(ProductPage.Purchaser_Name).sendKeys(purchaserName);
	}
	
	public static void clickGST(WebDriver wd)
	{
		wd.findElement(ProductPage.Click_GST).click();
	}
	
	public static void clickAvailablePayment(WebDriver wd)
	{
		wd.findElement(ProductPage.Available_Payment).click();
	}
	
	public static void clickOrderButton(WebDriver wd)
	{
		wd.findElement(ProductPage.Order_Button).click();
	}
	

}
