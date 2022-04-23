package com.vcentry.product.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vcentry.product.inputreader.InputReader;
import com.vcentry.product.intilializer.Initializer;
import com.vcentry.product.pages.LoginPage;
import com.vcentry.product.pages.ProductPage;
import com.vcentry.product.report.ReportGenerator;
public class ProductPageTest extends Initializer{
	@Test(dataProvider = "ProductPageTest")
	
	public void validateProductPage(String tcName,String username,String password,String product,
			String mobile,String email,String productCat,String qty,String purchaserName) throws IOException
	{
		
		initialize();
		//envprop.get("BROWSER").equals("CHROME")
		wd.get(envprop.getProperty("URL"));
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
	
		// Step 1
	/*	wd.findElement(By.name(locatorprop.getProperty("LOGINPAGE_TYPE_USERNAME_NAME"))).sendKeys("venkatvtu");
		wd.findElement(By.name(locatorprop.getProperty("LOGINPAGE_TYPE_PASSWORD_NAME"))).sendKeys("Venkat@12345");
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
		wd.get(envprop.getProperty("SIMPLE_FORM_URL"));
		wd.findElement(By.name(locatorprop.getProperty("PRODUCTPAGE_TYPE_PRODUCT_NAME"))).sendKeys("abcd");
		wd.findElement(By.id(locatorprop.getProperty("PRODUCTPAGE_TYPE_MOBILE_ID"))).sendKeys("1111111");
		wd.findElement(By.id(locatorprop.getProperty("PRODUCTPAGE_TYPE_EMAIL_ID"))).sendKeys("abcd@gmail.com");
		WebElement dropdown=	wd.findElement(By.id(locatorprop.getProperty("PRODUCTPAGE_SELECT_PRODUCTCATEGORY_ID")));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Electrical");
		wd.findElement(By.id(locatorprop.getProperty("PRODUCTPAGE_TYPE_QUANTITY_ID"))).sendKeys("10");
		wd.findElement(By.id(locatorprop.getProperty("PRODUCTPAGE_TYPE_PURCHASERNAME_ID"))).sendKeys("aaaaaa1");
		wd.findElement(By.id(locatorprop.getProperty("PRODUCTPAGE_CLICK_GST_ID"))).click();
		wd.findElement(By.id(locatorprop.getProperty("PRODUCTPAGE_CLICK_AVAILABLEPAYMENT_ID"))).click();
		wd.findElement(By.id(locatorprop.getProperty("PRODUCTPAGE_CLICK_ORDER_ID"))).click();
		*/
		//Step 2 this is called hybrid framework
		
	/*	elementByName("LOGINPAGE_TYPE_USERNAME_NAME").sendKeys("venkatvtu");
		elementByName("LOGINPAGE_TYPE_PASSWORD_NAME").sendKeys("Venkat@12345");
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
		wd.get(envprop.getProperty("SIMPLE_FORM_URL"));
		elementByName("PRODUCTPAGE_TYPE_PRODUCT_NAME").sendKeys("abcd");
		elementById("PRODUCTPAGE_TYPE_MOBILE_ID").sendKeys("1111111");
		elementById("PRODUCTPAGE_TYPE_EMAIL_ID").sendKeys("abcd@gmail.com");
		WebElement dropdown=	wd.findElement(By.id(locatorprop.getProperty("PRODUCTPAGE_SELECT_PRODUCTCATEGORY_ID")));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Electrical");
		elementById("PRODUCTPAGE_TYPE_QUANTITY_ID").sendKeys("10");
		elementById("PRODUCTPAGE_TYPE_PURCHASERNAME_ID").sendKeys("aaaaaa1");
		elementById("PRODUCTPAGE_CLICK_GST_ID").click();
		elementById("PRODUCTPAGE_CLICK_AVAILABLEPAYMENT_ID").click();
		elementById("PRODUCTPAGE_CLICK_ORDER_ID").click();
		*/
		//Step 3
	/*	LoginPage.enterUserName("venkatvtu");       // 0
		LoginPage.enterPassword("Venkat@12345");    //1
		LoginPage.clickLoginButton();
		wd.get(envprop.getProperty("SIMPLE_FORM_URL"));
		ProductPage.enterProduct("abcd");          //2
		ProductPage.enterMobileNumber("1234565");  //3
		ProductPage.enterEmailID("abc@gmail.com");  //4
		ProductPage.productCategory(wd,"Electrical");  //5
		ProductPage.enterProductQuantity("10");     //6
		ProductPage.enterPurchaserName("aaaaaaa");  //7
		ProductPage.clickGST(wd);
		ProductPage.clickAvailablePayment(wd);
		ProductPage.clickOrderButton(wd);
		*/
		//Step 4
		
		
		LoginPage.enterUserName(username);       // 0
		LoginPage.enterPassword(password);    //1
		LoginPage.clickLoginButton();
		wd.get(envprop.getProperty("SIMPLE_FORM_URL"));
		ProductPage.enterProduct(product);          //2
		ProductPage.enterMobileNumber(mobile);  //3
		ProductPage.enterEmailID(email);  //4
		ProductPage.productCategory(wd,productCat);  //5
		ProductPage.enterProductQuantity(qty);     //6
		ProductPage.enterPurchaserName(purchaserName);  //7
		ProductPage.clickGST(wd);
		ProductPage.clickAvailablePayment(wd);
		ProductPage.clickOrderButton(wd);
		log=reports.startTest(tcName+"--------completed");
	}
	
	@DataProvider(name="ProductPageTest")
	public static Object[][] getProductPage() throws IOException, IOException, Exception
	{
		// run test in 3 times
		// total data = 8 
		
		if(InputReader.runModeVerification("ProductPageTest"))
		{
		Object[][] data	= InputReader.selectSingleDataOrMulitiData("ProductPageTest");
		
		
		
		/*Object[][] data=new Object[3][8];
		//first set
		data[0][0]="venkatvtu";
		data[0][1]="Venkat@12345";
		data[0][2]="aaaaaa";
		data[0][3]="1111111";
		data[0][4]="aaaa@gmail.com";
		data[0][5]="Electrical";
		data[0][6]="10";
		data[0][7]="aaaaaaa";
		
		// second test
		
		data[1][0]="venkatvtu";
		data[1][1]="Venkat@12345";
		data[1][2]="bbbbbbb";
		data[1][3]="222222";
		data[1][4]="bbbb@gmail.com";
		data[1][5]="Electrical";
		data[1][6]="20";
		data[1][7]="bbbbbbbb";
		
		// thirdSet 
		
		data[2][0]="venkatvtu";
		data[2][1]="Venkat@12345";
		data[2][2]="cccccc";
		data[2][3]="333333";
		data[2][4]="ccccc@gmail.com";
		data[2][5]="Electrical";
		data[2][6]="30";
		data[2][7]="ccccccc";
		*/
		return data;
	}
	return null;
	
	}
	@AfterMethod
	public void tearDown(ITestResult it) throws IOException
	{
		ReportGenerator.generateReport(it);
	}
}
