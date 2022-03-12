package A4_Element;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A26_RadioButtonTest {

	public static void main(String[] args) {
		
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
		
		WebElement elementSet1=	wd.findElement(By.id("element1"));
		elementSet1.click();
		
		WebElement radioButtonLink=	wd.findElement(By.id("element4"));  //if we are handling single element 
		radioButtonLink.click();		
		
		List<WebElement> radio = wd.findElements(By.name("technology1"));  // At a same time if we are handling multiple element
																			// find elements so, we are using List<>
		for(int i=0; i<radio.size(); i++)
		{
			String data = radio.get(i).getAttribute("value");			// get(i) <--- is use for accessing the List(radio) values. and stored in data.
			System.out.println(data);
			
			if(data.equals("Flask"))
			{
				radio.get(i).click();							// Finally we are clicking here.
			}
		}

	}

}
