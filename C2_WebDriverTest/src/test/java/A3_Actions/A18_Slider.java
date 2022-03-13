package A3_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A18_Slider {

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
		
		WebElement sliderLink = wd.findElement(By.id("element22"));
		sliderLink.click();
		
		Actions a = new Actions(wd);	// here we r trying to use "Mouse"
										// so, Actions object is required. and passing web driver.
										// Don't move cursor when running the program.
		WebElement slider = wd.findElement(By.xpath("//*[@id=\"slider\"]/span"));					// **********Here pointing to the horizontal slider
		
		a.dragAndDropBy(slider, 350, 0).build().perform();		// 350 forward direction
		Thread.sleep(3000);
		a.dragAndDropBy(slider, -300, 0).build().perform();		// -300 backward direction
		a.release(slider);
		
		WebElement verticalslider = wd.findElement(By.xpath("//*[@id=\"slider-vertical\"]/span"));	// **********Here pointing to the vertical slider
		
		a.dragAndDropBy(verticalslider, 0, 95).build().perform();
		Thread.sleep(5000);
		a.dragAndDropBy(verticalslider, 0, -90).build().perform();
	}

}
