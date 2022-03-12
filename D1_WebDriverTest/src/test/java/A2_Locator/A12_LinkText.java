package A2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A12_LinkText {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		
		WebElement gmail = wd.findElement(By.linkText("Gmail"));	// here we are finding link text. so, (By.linkText)
																    // and also here "send keys" not required. bcoz gmail is a INPUT.
		gmail.click();												// instead of submit(). here we are using click().
							// ?????? If i run it. it will open a page without sign in. but, if i click manualy. it will open a page with sign in.
	}

}
