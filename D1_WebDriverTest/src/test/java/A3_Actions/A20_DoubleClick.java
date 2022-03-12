package A3_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A20_DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  // -------> instead of "Thread.sleep". here we r using "Implicitly Wait"
																	 // -------> here major advantage is "It will not wait for compulsary" and for brief refer notes*
		wd.get("https://djangovinoth.pythonanywhere.com/labhome");
		
		WebElement loginlink = wd.findElement(By.linkText("Login"));
		loginlink.click();
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("sadhan");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("KAAli@77");
		password.submit();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome");
		
		WebElement actionLink = wd.findElement(By.id("element20"));
		actionLink.click();
		//Thread.sleep(3000);                                           ---------> Instead of this we r using "Implicitly Wait".
		
		WebElement doubleClickLink = wd.findElement(By.id("element24"));
		doubleClickLink.click();
		
		Actions a = new Actions(wd);	// here we r trying to use "Mouse"
										// so, Actions object is required. and passing web driver.
										// Don't move cursor when running the program.
		
		WebElement button = wd.findElement(By.id("dbclick1"));
		a.doubleClick(button).build().perform();					// here double clicking the button

		WebElement imagebutton = wd.findElement(By.id("dbclick2"));
		a.doubleClick(imagebutton).build().perform();				// here double clicking the image

		
	}

}
