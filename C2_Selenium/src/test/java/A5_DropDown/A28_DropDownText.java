package A5_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.LoginScenario;

public class A28_DropDownText {

	public static void main(String[] args) {
	
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown");
		WebElement month = wd.findElement(By.id("month"));
		
		Select s = new Select(month);	 // In drop down concept we are using Select Object to access.
		
		List<WebElement> options = s.getOptions();
		System.out.println("Total size :" +options.size());
		
		for(int i=0; i<options.size(); i++)
		{
			String text = options.get(i).getText();
			System.out.println(text);
			
			//System.out.println(options.get(i).getText());
		}

	}

}
