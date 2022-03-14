package A5_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.LoginScenario;

public class A39_MultipleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown");
		WebElement day = wd.findElement(By.id("days"));
		
		Select s = new Select(day);  //Here creating a select object.
		
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByIndex(2);
		
		// For print Output in console
		
		List<WebElement> options = s.getAllSelectedOptions();	//get all the selected options
		
		for(int i=0; i<options.size(); i++)
		{
			String text = options.get(i).getText();
			System.out.println(text);
		}

	}

}
