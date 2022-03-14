package A7_javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A47_JavaScriptExecutorEnable {

	public static void main(String[] args) {

// why javascriptexecutor?  scenario : Situation like the developer Disabled the element and the task given to tester. to test the application.
			// AS a tester NO NEED to ask developer to enable the particular element.
			// with the help of "JAVASCRIPTEXECUTOR". we can able to access data inside of the disabled element.
			// And also using this "JAVASCRIPTEXECUTOR". we can able to Enable or Disable the particular element.
		
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("http://djangovinoth.pythonanywhere.com/enabledOrDisabled/");
		WebElement disable = wd.findElement(By.id("dis"));
		
		// But, Using Type casting we can able to merge both interfaces. so, we used ---> Brackets to cover (JavascriptExecutor).
		
		JavascriptExecutor js = (JavascriptExecutor) wd;						// For Enable: Remove disabled.
		
		js.executeScript("arguments[0].removeAttribute('disabled')", disable); // Here 'disabled' is in single quotes. why bcoz General rule: String inside the String is not possible.
		

	}

}
