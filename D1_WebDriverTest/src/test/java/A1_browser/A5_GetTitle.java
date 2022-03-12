package A1_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A5_GetTitle {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();		// Driver manager activating chrome driver.     -------------->      "WebDriverManager"
		WebDriver wd = new ChromeDriver();				// web driver is return type for chrome driver. -------------->      "WebDriver"
														// and creating object "wd" for chrome driver to access further.
		wd.manage().window().maximize();
		wd.get("https://www.google.com");				// "", https:// <-- must
		
		//System.out.println(wd.getTitle());  -----> Not Preferable
		
		String data = wd.getTitle();					// getting title
		System.out.println(data);

	}

}
