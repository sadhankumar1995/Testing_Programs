package A1_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2_EnterURL {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();			// Driver manager activating chrome driver.     -------------->      "WebDriverManager"
		WebDriver wd = new ChromeDriver();					// web driver is return type for chrome driver. -------------->      "WebDriver"
															// and creating object "wd" for chrome driver to access further.
		
		wd.get("www.google.com");							// will get error has invalid argument.(HTTPS is must)

	}

}
