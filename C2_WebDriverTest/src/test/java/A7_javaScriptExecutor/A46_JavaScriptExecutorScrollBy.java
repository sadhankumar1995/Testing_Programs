package A7_javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import util.LoginScenario;

public class A46_JavaScriptExecutorScrollBy {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("http://djangovinoth.pythonanywhere.com/scroll");
		
		JavascriptExecutor js = (JavascriptExecutor) wd; // But, Using Type casting we can able to merge both interfaces. so, we used ---> Brackets to cover (JavascriptExecutor).
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,1000)");  // here we r not initiating an element. so, no need of arguments[0]. Only we r simply scrolling.
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)");  // here we r not initiating an element. so, no need of arguments[0]. Only we r simply scrolling.
	}

}
