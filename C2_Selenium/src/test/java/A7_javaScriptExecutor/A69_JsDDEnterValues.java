package A7_javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A69_JsDDEnterValues {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement loginLink = wd.findElement(By.linkText("Login"));
		loginLink.click();
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("sadhan");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("KAAli@77");
		password.submit();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement jslink = wd.findElement(By.id("element30"));
		jslink.click();
		WebElement clickandtypelink = wd.findElement(By.id("element32"));
		clickandtypelink.click();
		WebElement enter = wd.findElement(By.name("firstname"));
	    
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].value='chennai'", enter);

	}

}
