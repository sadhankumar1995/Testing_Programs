package A1_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A6_GetCurrentURL {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();		// Driver manager activating chrome driver.     -------------->      "WebDriverManager"
		WebDriver wd =  new ChromeDriver();				// web driver is return type for chrome driver. -------------->      "WebDriver"
														// and creating object "wd" for chrome driver to access further.
		wd.manage().window().maximize();
		wd.get("https://www.google.com");				// "", https:// <-- must
		
		String data = wd.getCurrentUrl();				// getting current URl
		System.out.println(data);

	}

}
