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
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A16_FailedTestCaseScreenShot {
	
public WebDriver wd;						// Webdriver declared globally. so, scope is inside this entire class.  // Like: public int i;

@Test
public void google()
	{
		WebDriverManager.chromedriver().setup();
		wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
	
		wd.get(("https://www.google.com/"));
		WebElement search = wd.findElement(By.name("sgsgs"));			// Here we r given wrong "name"
	
		search.sendKeys("chennai");
		search.submit();
	}

@Test
public void tearDown() throws IOException			// Throws passing the information. but not handling the exception.	// In real time for screenshot we named as "TEARDOWN"
{
	File src = 	((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE); 				// TakesScreenshot & wd both r interfaces so bind it. Refer note i explained clearly.
	FileHandler.copy(src, new File("C:\\Users\\admin\\eclipse-workspace\\TestNG\\ScreenShot\\FailedScreenShot_1.png"));
}

}
