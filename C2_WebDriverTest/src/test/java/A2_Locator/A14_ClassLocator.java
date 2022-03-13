package A2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A14_ClassLocator {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com");
		
		WebElement search = wd.findElement(By.className("sb_form_q"));	// here we are finding classname. so, (By.classname)
		search.sendKeys("chennai");
		
		//search.click();        // It will not work. click() is different, submit() is different.
		
		search.submit();
	}

}
