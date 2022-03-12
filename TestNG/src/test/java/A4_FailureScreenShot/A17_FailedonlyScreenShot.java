package A4_FailureScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A17_FailedonlyScreenShot {

	public WebDriver wd;
	
	@Test(priority = 2)
	public void google()
	{
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
	
		wd.get(("https://www.google.com/"));
		WebElement search = wd.findElement(By.name("q"));			// correct
	
		search.sendKeys("chennai");
		search.submit();
	}
		
	@Test(priority = 1)
	public void bing()
	{
			WebDriverManager.chromedriver().setup();
			wd= new ChromeDriver();
			wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wd.manage().window().maximize();
			
			wd.get("https://www.Bing.com/");
			WebElement search=wd.findElement(By.name("sgsgs"));		// wrong
			
			search.sendKeys("chennai");
			search.submit();
	}
	
	@AfterMethod													// This is not a Test Case
	
	public void tearDown(ITestResult r) throws IOException	// here we r passing parameter as ((( "ITestResult" ))) // Throws passing the information. but not handling the exception.
	{
		if(!r.isSuccess())											// capturing only failed test case result.
		{
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);				// TakesScreenshot & wd both r interfaces so bind it. Refer note i explained clearly.
		FileHandler.copy(src, new File("C:\\Users\\admin\\eclipse-workspace\\TestNG\\ScreenShot\\"+ r.getName() +".png"));		// Using .getName() to name it.
		}
	}
}
