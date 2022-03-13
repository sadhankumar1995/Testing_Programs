package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void enterUserName(WebDriver wd, String username)			// Static. so, no extends Keyword. for accessing this in other class.
	{
		/*WebElement user = wd.findElement(By.name("username"));			// Instead of these 2 lines we customize into 1 single line.
		user.sendKeys("abcd");	*/
		
		wd.findElement(By.name("username")).sendKeys(username);
	}
	
	public static void enterPassword(WebDriver wd, String password)			/// Static. so, no extends Keyword. for accessing this in other class.
	{
		wd.findElement(By.name("password")).sendKeys(password);
	}
	
	public static void clickLoginButton(WebDriver wd)						// Static. so, no extends Keyword. for accessing this in other class.
	{
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
}
