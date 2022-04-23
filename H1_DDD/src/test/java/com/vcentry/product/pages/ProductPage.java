package com.vcentry.product.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.vcentry.product.intilializer.Initializer;

public class ProductPage extends Initializer{

	public static void enterProduct(String productName)
	{
		elementByName("PRODUCTPAGE_TYPE_PRODUCT_NAME").sendKeys(productName);
	}
	public static void enterMobileNumber(String mobileNumber)
	{
		elementById("PRODUCTPAGE_TYPE_MOBILE_ID").sendKeys(mobileNumber);
	}
	public static void enterEmailID(String emailID)
	{
		elementById("PRODUCTPAGE_TYPE_EMAIL_ID").sendKeys(emailID);
	}
	public static void productCategory(WebDriver wd,String productcat)
	{
		WebElement dropdown=	wd.findElement(By.id("id3"));
		Select s=new Select(dropdown);
		s.selectByVisibleText(productcat);
	}
	public static void enterProductQuantity(String quantity)
	{
		elementById("PRODUCTPAGE_TYPE_QUANTITY_ID").sendKeys(quantity);
		
	}
	
	public static void enterPurchaserName(String purchaserName)
	{
		elementById("PRODUCTPAGE_TYPE_PURCHASERNAME_ID").sendKeys(purchaserName);
	}
	public static void clickGST(WebDriver wd)
	{
		elementById("PRODUCTPAGE_CLICK_GST_ID").click();
	}

	public static void clickAvailablePayment(WebDriver wd)
	{
		elementById("PRODUCTPAGE_CLICK_AVAILABLEPAYMENT_ID").click();
	}
	
	public static void clickOrderButton(WebDriver wd)
	{
		elementById("PRODUCTPAGE_CLICK_ORDER_ID").click();
	}
	
	
}
