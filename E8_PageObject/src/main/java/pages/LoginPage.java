package pages;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class LoginPage {		////  page object model so class name should same Here LoginPage.
	
// Note: Here IN real time page object model. ----> Pages are created under src/main/java
//     		(((bcoz))) in this class we just creating only methods. Not Executing anything over here	
	
	public static void pageURL(WebDriver wd, String url)   // Declared as static...--> then only we can access this method out side of the class.
	{														// By calling className.methodName.
		wd.get(url);										//  No need to creating an object. and no need to use extends keyword.
	}
	
	public static void clickLoginLink(WebDriver wd)			// Declared as static
	{
		wd.findElement(By.linkText("Login")).click();
	}
	
	public static void verifyLoginPage(WebDriver wd)
	{
		String Title = wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/legend")).getText();
		
//		Assert.assertEquals("Log in", Title);
		
		SoftAssertions s = new SoftAssertions();						// In real time we need to Assert pages to confirm.
		s.assertThat("Log in".equals(Title));
		s.assertAll();
	}
	
	public static void enterLoginUserName(WebDriver wd, String username)
	{
		wd.findElement(By.id("id_username")).sendKeys(username);
	}
	
	public static void enterLoginPassword(WebDriver wd, String password)
	{
		wd.findElement(By.name("password")).sendKeys(password);
	}
	
	public static void clickTheLoginButton(WebDriver wd)
	{
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
	
	public void validateTheHomePage(WebDriver wd)						// In real time we need to Assert pages to confirm.
	{
		String actual = wd.findElement(By.xpath("/html/body/main/div/div[1]/div/h3/em")).getText();
		Assert.assertEquals("Technologies", actual);
	}
}
