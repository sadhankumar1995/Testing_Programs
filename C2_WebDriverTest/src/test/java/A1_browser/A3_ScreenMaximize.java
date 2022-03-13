package A1_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A3_ScreenMaximize {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();		 // Driver manager activating chrome driver.     -------------->      "WebDriverManager"
		WebDriver wd = new ChromeDriver();				// web driver is return type for chrome driver. -------------->      "WebDriver"
														// and creating object "wd" for chrome driver to access further.
		
		wd.manage().window().maximize();				// manage() is used for to create window()(means TAB). then maximize the screen.
		wd.get("https://www.google.com");				// "", https:// <-- must	
		
	}

}
