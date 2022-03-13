package A5_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A36_JavaSelectbyVisibleText {

	public static void main(String[] args) {
	
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown");
		
		WebElement month = wd.findElement(By.id("month"));
		
		List<WebElement> options = month.findElements(By.tagName("option"));	 // Here without using select. we can able to achieve by using "TAGNAME".
																					// 1) taking list of web element options
		System.out.println("Total size: " +options.size());
		
		for (int i=0; i<options.size(); i++)			// 2) making for loop
		{
			String text = options.get(i).getText();		// 3) get Text from the web element list.
			
			if(text.equals("Salem"))					// 4) comparing with the input
			{
				options.get(i).click();					// 5) Finally click it.
			}
		}

	}

}
