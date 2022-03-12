package A8_ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A24_ParallelExecution {

	WebDriver wd;
	@Test
	@Parameters({"browser"})											// In in parameters concept we r use (((.XML file for KEY & VALUE))) combination.
	public void google(String browser) throws InterruptedException
	{
		
		if(browser.equals("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\C1_WebDriverTest\\browser\\chromedriver.exe");
			wd = new ChromeDriver();
		}
		
		else if(browser.equals("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\C1_WebDriverTest\\browser\\geckodriver.exe");
			wd = new FirefoxDriver();
		}
		
		wd.get("http://www.google.com");
		WebElement search=	wd.findElement(By.name("q"));
		search.sendKeys("chennai");
		search.submit();
		Thread.sleep(3000);
		wd.navigate().back();
		Thread.sleep(3000);
		wd.navigate().forward();
	}
}
