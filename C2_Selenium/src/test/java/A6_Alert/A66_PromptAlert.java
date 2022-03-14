package A6_Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A66_PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/alert");
		
		WebElement alert = wd.findElement(By.id("id3"));
		alert.click();
		
		Alert a = wd.switchTo().alert();  //alert ReturnType is Alert. switchTo is used for a targetelement. This line is for alert window.
		
		Thread.sleep(3000);
		a.sendKeys("SADHAN KUMAR S");
		Thread.sleep(3000);
		a.accept();

	}

}
