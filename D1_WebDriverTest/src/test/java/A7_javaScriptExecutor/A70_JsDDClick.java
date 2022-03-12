package A7_javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A70_JsDDClick {

	public static void main(String[] args) throws InterruptedException {
	
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
		Thread.sleep(3000);
		WebElement clickandtypelink = wd.findElement(By.id("element32"));
		clickandtypelink.click();
		WebElement click = wd.findElement(By.linkText("Google"));
	    
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].click()", click);

	}

}
