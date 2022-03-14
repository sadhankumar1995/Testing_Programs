package A5_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A33_JavaDropDownCount {

	public static void main(String[] args) {
		
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown");
		
		WebElement month = wd.findElement(By.id("month"));
		
		List<WebElement> options = month.findElements(By.tagName("option")); // Here without using select. we can able to achieve by using "TAGNAME".
		
		System.out.println("Total size: " +options.size());
	}

}
