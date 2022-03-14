package A11_ChromeOptions;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A60_IgnoreInfoBar {

	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
														// Don't Mug up. just know this. Copied from stackOverFlow
	ChromeOptions opt = new ChromeOptions();
	opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
	opt.setExperimentalOption("useAutomationExtension", false);
	
	WebDriver wd = new ChromeDriver(opt);
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	wd.manage().window().maximize();
	wd.get("https://www.google.com/");
	
	}

}
