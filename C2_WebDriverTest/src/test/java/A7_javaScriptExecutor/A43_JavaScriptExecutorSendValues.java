package A7_javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A43_JavaScriptExecutorSendValues {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.get("https://www.google.com/");
		WebElement search = wd.findElement(By.name("q"));
		
		//search.sendKeys("chennai");   // Without using of sending keys. here we r using javascriptexecutor.
		
		JavascriptExecutor js = (JavascriptExecutor) wd;  // Actually, wd(WebDriver) & JavascriptExecutor both r Interfaces. so, 2 interfaces can't able to merge.
														// But, Using Type casting we can able to merge both interfaces. so, we used ---> Brackets to cover (JavascriptExecutor).
		
		js.executeScript("arguments[0].value='chennai'", search); // Here 'chennai' is in single quotes. why bcoz General rule: String inside the String is not possible.
																	// "arguments[0]" This is common.
		
		// Here using javascriptexecutor. we r directly passing value to inspect(HardCode). Later on that value fetch to the search element.
		
		// Advantage : 100% execution guaranteed. 
	}


}
