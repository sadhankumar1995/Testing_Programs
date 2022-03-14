package A3_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A17_Resize {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
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
		
		WebElement resizeLink = wd.findElement(By.id("element21"));
		resizeLink.click();
		
		Actions a = new Actions(wd);	// here we r trying to use "Mouse"
										// so, Actions object is required. and passing web driver.
										// Don't move cursor when running the program.
		
		WebElement resize = wd.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		a.clickAndHold(resize).build().perform();		// If we r using mouse means compulsary. we need to use ".build().perform()". 
		
		Thread.sleep(3000);
							//  X    Y axis
		a.moveToElement(resize, 350, 250).build().perform();
		a.release(resize).build().perform();

	}

}
