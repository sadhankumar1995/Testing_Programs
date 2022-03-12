package A5_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.LoginScenario;

public class A32_SelectByValue {

	public static void main(String[] args) {
		
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown");
		
		WebElement month = wd.findElement(By.id("month"));
		
		Select s = new Select(month);	// In drop down concept we are using Select Object to access.
		
		s.selectByValue("06");

	}

}
