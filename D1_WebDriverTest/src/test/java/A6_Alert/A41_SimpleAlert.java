package A6_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A41_SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/alert");
		WebElement alert = wd.findElement(By.id("id1"));
		
		Thread.sleep(3000);
		alert.click();
		
		Alert a = wd.switchTo().alert(); // Actually this alert notification pop-up message is in the different frame.
		// Only with the help of Web Driver. we can able to switch using " switchTo().alert() ".
		
		Thread.sleep(3000);
		a.accept();				// Here accepting the notification message, using Alert.
		

	}

}
