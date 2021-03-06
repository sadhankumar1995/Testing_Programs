package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;
import pages.ProductPage;

public class LoginTest {
	
	WebDriver wd;		// webDriver required for all 3 classes. So, we declared globally and passing this webDriver By parameters.
	
	
	@Test(dataProvider = "product")
	public void loginTest(String username, String password, String productName, 					// By passing parameters. we can able to use datas.
			String mobilenumber, String email, String quantity, String purchaserName)
	{
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		
		// wd for finding an element, username for passing the values.
		
		LoginPage.enterUserName(wd, username);					// By calling the class name. we can able to access methods in that class.
		LoginPage.enterPassword(wd, password);
		LoginPage.clickLoginButton(wd);
		
		wd.get("https://djangovinoth.pythonanywhere.com/simpleform/");
		
		ProductPage.enterProduct(wd, productName);
		ProductPage.enterMobileNumber(wd, mobilenumber);
		ProductPage.enterEmailID(wd, email);
		ProductPage.productCategory(wd);
		ProductPage.enterProductQuantity(wd, quantity);
		ProductPage.enterPurchaserName(wd, purchaserName);
		ProductPage.clickGST(wd);
		ProductPage.clickAvailablePayment(wd);
		ProductPage.clickOrderButton(wd);
	}	
	
	
	@DataProvider(name = "product")
	public Object[][] getProductDetails()
	{												//	2                 7
		Object [][] data = new Object[2][7];		// [0, 1] [0, 1, 2, 3, 4, 5, 6]
		
		data[0][0]="sadhan";
		data[0][1]="KAAli@77";
		data[0][2]="aaaaa";
		data[0][3]="1111111";
		data[0][4]="aaaa@gmail.com";
		data[0][5]="10";
		data[0][6]="aaaaaaaaa";
		
		data[1][0]="sadhan";
		data[1][1]="KAAli@77";
		data[1][2]="bbbbb";
		data[1][3]="22222222";
		data[1][4]="bbbbb@gmail.com";
		data[1][5]="20";
		data[1][6]="bbbbbbbb";
		
		return data;
	}

}
