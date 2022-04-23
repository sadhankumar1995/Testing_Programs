package com.vcentry.product.pages;

import org.openqa.selenium.By;

import com.vcentry.product.intilializer.Initializer;

public class LoginPage extends Initializer{

	public static void enterUserName(String username)
	{
		elementByName("LOGINPAGE_TYPE_USERNAME_NAME").sendKeys(username);
	}
	
	public static void enterPassword(String password)
	{
		elementByName("LOGINPAGE_TYPE_PASSWORD_NAME").sendKeys(password);
	
	}
	
	public static void clickLoginButton()
	{
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
	
	
	
	
}
