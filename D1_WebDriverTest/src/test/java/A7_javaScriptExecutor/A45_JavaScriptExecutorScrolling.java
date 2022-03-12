package A7_javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A45_JavaScriptExecutorScrolling {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("http://djangovinoth.pythonanywhere.com/scroll");
		WebElement seaborn = wd.findElement(By.id("id7"));
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) wd;	// But, Using Type casting we can able to merge both interfaces. so, we used ---> Brackets to cover (JavascriptExecutor).
		
		js.executeScript("arguments[0].scrollIntoView()", seaborn);		// "arguments[0]" This is common, and output passing to the seaborn.

		// Here using javascriptexecutor. we r directly scrolling in inspect(HardCode).
		
		// Advantage : 100% execution guaranteed. 
	}

}
