package A2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A16_VcentryLogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome");
		
		 WebElement loginlink = wd.findElement(By.linkText("Login"));
		loginlink.click();
		
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("sadhan");									// for sendkeys " " is important
		
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("KAAli@77");									// for sendkeys " " is important
		
		password.submit();												// here submit() is enough for to allow for next page.
		
		wd.get("https://djangovinoth.pythonanywhere.com/labhome");		// here after loged in there is a Bug in "skill enhancement" drop down.
																		// so, here we r directly accessing lab practice page.
	}

}
