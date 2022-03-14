package A11_ChromeOptions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A62_MobileView {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();								// Mostly we r not using this concept in RealTime.
																			
	Map<String, String> mobileEmulation = new HashMap<String,String>();		// (Map) collection concept is using Bcoz of Key & Value Pair combination.
	mobileEmulation.put("deviceName", "iPad Mini");														// Key = deviceName, Value = iPad Mini
	
	ChromeOptions opt= new ChromeOptions();
	opt.setExperimentalOption("mobileEmulation", mobileEmulation);

	WebDriver wd = new ChromeDriver(opt);
	wd.get("https://www.google.com");
	
	}

}
