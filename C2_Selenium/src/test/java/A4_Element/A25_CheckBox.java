package A4_Element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A25_CheckBox {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);  // -------> instead of "Thread.sleep". here we r using "Implicitly Wait"
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
		
		WebElement elementSet1=	wd.findElement(By.id("element1"));
		elementSet1.click();
		
		WebElement checkBoxLink = wd.findElement(By.id("element3"));
		checkBoxLink.click();
		
		WebElement django = wd.findElement(By.id("Django"));
		
		// Conditions for "CHECK BOX"
		
		if(django.isDisplayed())			// 1st weather it is displayed or not??
		{
			System.out.println("checkBox is displayed");
		}
		if(django.isEnabled())				// 2nd weather it is enabled or not??
		{
			System.out.println("checkbox is enabled");
		}
		if(!django.isSelected())			// 3rd weather it is already selected or not??
		{
			System.out.println("checbox is not selected");
			django.click();										// Then finally click it
		}
		else
		{
			System.out.println("checkbox is already selected");
		}
		
	}

}
