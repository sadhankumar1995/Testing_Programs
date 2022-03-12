package A7_javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A44_JavaScriptExecutorClick {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.get("https://www.google.com/");
		WebElement search = wd.findElement(By.linkText("Gmail"));
		
		//search.click();
		
		JavascriptExecutor js = (JavascriptExecutor) wd;	// But, Using Type casting we can able to merge both interfaces. so, we used ---> Brackets to cover (JavascriptExecutor).
		
		js.executeScript("arguments[0].click()", search);		// "arguments[0]" This is common, and output passing to the search.

		// Here using javascriptexecutor. we r directly clicking gmail in inspect(HardCode).
		
		// Advantage : 100% execution guaranteed. 
	}

}
