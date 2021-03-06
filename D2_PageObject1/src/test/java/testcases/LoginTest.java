package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.ProductPage;

@Test
public class LoginTest {
	
	WebDriver wd;						// Declared globally
	
	public void loginTest()
	{
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		
		LoginPage.enterUserName(wd, "sadhan");					// By calling the class name. we can able to access methods in that class.
		LoginPage.enterPassword(wd, "KAAli@77");
		LoginPage.clickLoginButton(wd);
		
		wd.get("https://djangovinoth.pythonanywhere.com/simpleform/");
		
		ProductPage.enterProduct(wd, "abcd");
		ProductPage.enterMobileNumber(wd, "644444644");
		ProductPage.enterEmailID(wd, "avsv@gmail.com");
		ProductPage.productCategory(wd);
		ProductPage.enterProductQuantity(wd, "10");
		ProductPage.enterPurchaserName(wd, "sadhan");
		ProductPage.clickGST(wd);
		ProductPage.clickAvailablePayment(wd);
		ProductPage.clickOrderButton(wd);
	}

}
