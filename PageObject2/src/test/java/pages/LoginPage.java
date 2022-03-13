package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public static By UserName   = By.name("username");		// In some projects using this model.
	public static By PassWord   = By.name("password");
	public static By ClickLogin = By.xpath("/html/body/main/div/div/div/div/form/div/button");
	
	

	public static void enterUserName(WebDriver wd, String username)			// Static. so, no extends Keyword. for accessing this in other class.
	{
	  //	wd.findElement(By.name("username")).sendKeys(username);		// Instead of this line. We r using next line.
		
				   // classsName.variableName
		
		wd.findElement(LoginPage.UserName).sendKeys(username);
	}
	
	public static void enterPassword(WebDriver wd, String password)
	{
		wd.findElement(LoginPage.PassWord).sendKeys(password);
	}
	
	public static void clickLoginButton(WebDriver wd)
	{
		wd.findElement(LoginPage.ClickLogin).click();
	}
	
}
