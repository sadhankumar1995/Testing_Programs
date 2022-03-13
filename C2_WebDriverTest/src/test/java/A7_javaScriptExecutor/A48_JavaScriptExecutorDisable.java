package A7_javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A48_JavaScriptExecutorDisable {

	public static void main(String[] args) {

		// why javascriptexecutor?  scenario : Situation like the developer Disabled the element and the task given to tester. to test the application.
					// AS a tester NO NEED to ask developer to enable the particular element.
					// with the help of "JAVASCRIPTEXECUTOR". we can able to access data inside of the disabled element.
					// And also using this "JAVASCRIPTEXECUTOR". we can able to Enable or Disable the particular element.
				
				WebDriver wd = LoginScenario.loginVcentryApplication();
				wd.get("http://djangovinoth.pythonanywhere.com/enabledOrDisabled/");
				WebElement disable = wd.findElement(By.id("ena"));
				
				JavascriptExecutor js = (JavascriptExecutor) wd;
				
				// But, Using Type casting we can able to merge both interfaces. so, we used ---> Brackets to cover (JavascriptExecutor).
																									// For Disable: set disabled.
				//js.executeScript("arguments[0].setAttribute('disabled', 'sadhan')", disable);  // This is also correct one. But not recommended to use Name.
				js.executeScript("arguments[0].setAttribute('disabled', 'true')", disable);		// Using true is formal one
				

				// In Set Attribute we have pass (((((2 arguments))))) ---> setAttribute('disabled', 'true')
				//Error for without using true:	javascript error: Failed to execute 'setAttribute' on 'Element': 2 arguments required, but only 1 present.
	}

}
