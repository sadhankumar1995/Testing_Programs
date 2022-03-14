package A6_Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A65_BootStrap {

	public static void main(String[] args) {
		
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		
		WebElement Elementset2 = wd.findElement(By.id("element10"));
		Elementset2.click();
		
		WebElement Bootstrap1 = wd.findElement(By.id("element16"));
		Bootstrap1.click();
		
		WebElement Bootstrap2 = wd.findElement(By.id("alert"));
		Bootstrap2.click();
			

	}

}
