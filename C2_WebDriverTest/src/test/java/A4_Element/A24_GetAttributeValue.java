package A4_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A24_GetAttributeValue {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		wd.get("https://www.bing.com");
		WebElement searchbox =  wd.findElement(By.id("sb_form_q"));
		searchbox.sendKeys("chennai");
		String data = searchbox.getAttribute("value");    // here we are getting actual value from website.
		System.out.println(data);
		
	}

}
