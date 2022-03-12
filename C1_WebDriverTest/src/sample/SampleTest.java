package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\C1_WebDriverTest\\browser\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.google.com");
		
	}

}
