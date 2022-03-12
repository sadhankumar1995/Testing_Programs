package A7_javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A71_JavaScriptExecutorScrolling {

	public static void main(String[] args) {
	
	WebDriver wd = LoginScenario.loginVcentryApplication();
	wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
	WebElement javascriptlink = wd.findElement(By.id("element30"));
	javascriptlink.click();
	WebElement scrolling = wd.findElement(By.id("element31"));
	scrolling.click();
	WebElement pandas = wd.findElement(By.id("id6"));
	
	JavascriptExecutor js = (JavascriptExecutor) wd;
	js.executeScript("arguments[0].scrollIntoView()", pandas);//this scrollintoview option will directly go into element which we inspect
	}

}
