package A4_Element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.LoginScenario;

public class A55_AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wd = LoginScenario.loginVcentryApplication();
		wd.get("https://djangovinoth.pythonanywhere.com/autocomplete/");
		
		WebElement tag1 = wd.findElement(By.id("tags1"));
		tag1.sendKeys("a");
		List<WebElement> tag2 = wd.findElements(By.xpath("//*[@id=\"ui-id-3\"]/li"));
		System.out.println(tag2.size());
		
		for(int i=0; i<tag2.size(); i++)
		{
			String text = tag2.get(i).getText();  // here we are not using getAttribute. Bcoz,
													// Bcoz, we are sending keys to the particular element. that inputs stored in the value.
														// After using the getAttribute we can ABLE TO GET THE INPUT FROM VALUE, WHICH IS GIVEN BY ME.
			
			System.out.println(text);  // here we are using getText. to getting the value which is ALREADY GIVEN BY THE DEVELOPER.
			
				if(text.equals("JavaScript"))
				{
					Thread.sleep(3000);
					tag2.get(i).click();
				}
		}
		
		

	}

}
