package A5_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A38_JavaSelectByValue {

	public static void main(String[] args) {
	
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown");
		WebElement month =  wd.findElement(By.id("month"));  // Identifying an element
		
		List<WebElement> options = month.findElements(By.tagName("option")); // accessing a list of options
		
		for (int i=0; i<options.size(); i++)
		{
			String text = options.get(i).getAttribute("value");	// Here using "getAttribute" we can able to access "All Values(1to38)" which is stored in value.
			if(text.equals("23"))
			{
				options.get(i).click();
			}
		}

	}

}
