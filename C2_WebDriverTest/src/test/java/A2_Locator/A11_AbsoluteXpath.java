package A2_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A11_AbsoluteXpath {

	public static void main(String[] args) {

		WebDriverManager.chromiumdriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		
		//WebElement search = wd.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/form/input[1]"));
		
																				// here we are finding xpath. so, (By.xpath)
		WebElement search = wd.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input"));
		search.sendKeys("chennai");
		search.submit();
	}

}
