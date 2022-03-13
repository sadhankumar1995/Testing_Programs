package A9_staleElementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A51_staleElementException {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.get("https://www.google.com/");
		WebElement search=	wd.findElement(By.name("q"));		
		
		search.sendKeys("chennaiyin fc");
		search.submit();
		
		wd.navigate().back();	// Here navigate() is used for move forward or backward.
		search.sendKeys("Annamalai IPS");  // Exception : stale element reference: element is not attached to the page document.
		search.submit();
	}

}
