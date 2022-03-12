package A5_DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.LoginScenario;

public class A29_GetFirstOptions {

	public static void main(String[] args) {
	
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown");
		
		WebElement month = wd.findElement(By.id("month"));
		
		Select s = new Select(month); // In drop down concept we are using Select Object to access.
	
		WebElement option = s.getFirstSelectedOption();  // Here we are choosing first selected option.
		String text = option.getText();
		System.out.println("Selected option : " +text);
		
		
	}

}
