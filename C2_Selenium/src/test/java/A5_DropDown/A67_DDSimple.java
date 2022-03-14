package A5_DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A67_DDSimple {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement loginlink = wd.findElement(By.linkText("Login"));
		loginlink.click();
		WebElement username = wd.findElement(By.id("id_username"));
		username.sendKeys("sadhan");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("KAAli@77");
		password.submit();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		WebElement elementlink = wd.findElement(By.id("element10"));
		elementlink.click();
		WebElement dropdownlink = wd.findElement(By.id("element11"));
		dropdownlink.click();
		WebElement month = wd.findElement(By.id("month1"));
		
		Select s = new Select(month);
		List<WebElement> options = s.getOptions();
		System.out.println(options.size()); //to get a total size of the option
		
		System.out.println("............................");
		
		
		for(int i=0;i<options.size();i++)// to get all the options we r using for loop
		{
			String text = options.get(i).getText();//return type of gettext is string
			System.out.println(text);
		}
		
		System.out.println("........................");
		
		WebElement option = s.getFirstSelectedOption();//to fetch a first element in DD. return type of getFirstSelectedOption is webelement
	    String text = option.getText();//get a text
	    System.out.println(text);
	    
	    System.out.println(".............................");
	    Thread.sleep(2000);
	    s.selectByVisibleText("May");//it will select may in DD
	    
	    System.out.println("....................");
	    Thread.sleep(2000);
	    s.selectByIndex(5);//it will select june in DD
	    
	    System.out.println("........................");
	    Thread.sleep(2000);
	    s.selectByValue("05");//it will select may in DD

	}

}
