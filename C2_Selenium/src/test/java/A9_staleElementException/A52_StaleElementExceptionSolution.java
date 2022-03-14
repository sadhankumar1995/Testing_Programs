package A9_staleElementException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A52_StaleElementExceptionSolution {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		wd.get("https://www.google.com/");
		
/*		WebElement search=	wd.findElement(By.name("q"));		
		search.sendKeys("chennaiyin fc");
		search.submit();
		
		wd.navigate().back();	// Here navigate() is used for move forward or backward.
		WebElement search1=	wd.findElement(By.name("q")); // Again we need to Find element. then only it will work.		
		search.sendKeys("Annamalai IPS");
		search.submit();
*/		
		
		// SHORTLY in REAL TIME without using "WEB ELEMENT". interesting......
		
		wd.findElement(By.name("q")).sendKeys("chennaiyin fc");
		wd.findElement(By.name("q")).submit();
		wd.navigate().back();
		wd.findElement(By.name("q")).sendKeys("Annamalai IPS");
		wd.findElement(By.name("q")).submit();

	}

}
