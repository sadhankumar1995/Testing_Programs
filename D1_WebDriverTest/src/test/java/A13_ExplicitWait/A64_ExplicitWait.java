package A13_ExplicitWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A64_ExplicitWait {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		wd.get("https://djangovinoth.pythonanywhere.com/labhome");
		
		WebElement loginLink=	wd.findElement(By.linkText("Login"));
		loginLink.click();
		WebElement username=	wd.findElement(By.id("id_username"));
		username.sendKeys("sadhan");
		WebElement password=	wd.findElement(By.name("password"));
		password.sendKeys("KAAli@77");
		password.submit();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		
		WebDriverWait wait = new WebDriverWait(wd, 10);										// Here ExplicitWait we need to Add inside before the specific code. Moreover, it is also work like a implicit wait.
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("element1")));		// Actually here, it is wait for loading the WebElement.
		
		WebElement elementSet1=	wd.findElement(By.id("element1"));
		elementSet1.click();
		
		WebElement radioButtonLink=	wd.findElement(By.id("element4"));
		radioButtonLink.click();
		
		List<WebElement> radio=	wd.findElements(By.name("technology1"));  // List is used for Handling a multiple Elements.
		for(int i=0;i<radio.size();i++)
		{
		String data=	radio.get(i).getAttribute("value");
			System.out.println(data);
			if(data.equals("Flask"))
			{
				radio.get(i).click();
			}
		
		
	}

	}}
