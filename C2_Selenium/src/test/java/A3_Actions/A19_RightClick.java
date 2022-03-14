package A3_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A19_RightClick {

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
		
		//Thread.sleep(5000);	// Without this line u will not get output. bcoz there is a small time delay to ope a drop down.
								// so, that eclipse run the program fastly. But, website performs slowly.
		
		WebElement rightClickLink = wd.findElement(By.id("element23"));
		rightClickLink.click();
		
		Actions a = new Actions(wd);	// here we r trying to use "Mouse"
										// so, Actions object is required. and passing web driver.
										// Don't move cursor when running the program.
		
		WebElement rightclick = wd.findElement(By.id("id6"));
		a.contextClick(rightclick).build().perform();             // @#$ IMPORTANT INTERVIEW QUESTION $#@
																  // ".contextClick" is used for to Right Clicking in mouse. 
	}

}
