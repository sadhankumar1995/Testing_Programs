package A3_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A21_DragAndDrop {

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
		
		WebElement dragAndDropLink = wd.findElement(By.id("element25"));
		dragAndDropLink.click();
		
		Actions a = new Actions(wd);	// here we r trying to use "Mouse"
										// so, Actions object is required. and passing web driver.
										// Don't move cursor when running the program.
		
		/*
		 WebElement start1 = wd.findElement(By.id("draggable"));	
		 WebElement end1   =  wd.findElement(By.id("droppable"));
		 a.dragAndDrop(start1, end1).build().perform();
		 */
		
		WebElement start2 = wd.findElement(By.id("draggable"));	
		WebElement end2   = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[2]/div/div/div"));
		a.dragAndDrop(start2, end2).build().perform();
		
		WebElement start3 = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[2]/div/div/ul/li[1]/img"));
		WebElement end3   = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[2]/div/div/div"));
		a.dragAndDrop(start3, end3).build().perform();
		
		Thread.sleep(1000);
		
		WebElement start4 = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[2]/div/div/ul/li[3]/img"));
		WebElement end4   = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[2]/div/div/div"));
		a.dragAndDrop(start4, end4).build().perform();
																												// More than 2 images can't able move to trash
	}

}
