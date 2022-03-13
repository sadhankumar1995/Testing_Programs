package A2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A15_EnterButton {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		
		WebElement search = wd.findElement(By.name("q"));	// here we are finding name. so, (By.name)
		search.sendKeys("chennai");
		search.sendKeys(Keys.ENTER);	// here sendKeys is required to access "ENTER KEY".       // "submit()" & "Keys.ENTER" both r doing same work
										// Here Using "Keys." we can able to access the Keyboard Keys. 
	}

}
