package A2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A13_PartialLinkText {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		
		//WebElement gmail = wd.findElement(By.partialLinkText("gma"));     // here driver will not find Gmail. bcoz we r given "gma".
		
																			// "capital letters" Matter.	// we should provide "Gma"
	
		WebElement gmail = wd.findElement(By.partialLinkText("Gma"));		// here we are finding partial link text. so, (By.partiallinkText)
		gmail.click();

	}

}
