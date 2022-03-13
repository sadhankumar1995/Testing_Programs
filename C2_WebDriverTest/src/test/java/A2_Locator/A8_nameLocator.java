package A2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A8_nameLocator {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd =  new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		
		WebElement search = wd.findElement(By.name("q"));		// web element is return type of find element
																// find element is used to find something. here we are finding name. so, (By.name)
		
		search.sendKeys("chennai");								// send keys is for to sending input to driver
		
		
		}

}
