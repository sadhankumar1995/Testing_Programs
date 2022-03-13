package A4_Element;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A56_GetAllLinks {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		List<WebElement> links = wd.findElements(By.tagName("a"));		// Here using TAG_name concept all links r tagged under "a".
	
		
		for(int i=0; i<links.size(); i++)
		{
			String text = links.get(i).getText();
			
			if(!text.isEmpty())	// To avoid the spaces between the tags and also no such element exception. Here we are using " !.isEmpty() "
			{					// Bcoz, In real time we not working with spaces in console.
				
				System.out.println(text);
			}
		}
	}

}
