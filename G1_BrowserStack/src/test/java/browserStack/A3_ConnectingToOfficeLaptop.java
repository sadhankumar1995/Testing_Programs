package browserStack;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class A3_ConnectingToOfficeLaptop {
	
	  public static final String AUTOMATE_USERNAME = "sadhankumar_xUFMhX";
	  public static final String AUTOMATE_ACCESS_KEY = "2FwqWLaf1Z8t9MyeaHnz";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	  public static void main(String[] args) throws MalformedURLException
	  
	  {
	    DesiredCapabilities caps = new DesiredCapabilities();
	    
	    caps.setCapability("browserstack.local", "true");		// ----> This code is for connecting browserStack(3rd party) to Office Laptop. 
	    														//   Note: CMD prompt must open before run this code. Otherwise, this code will throw an error.
	    
	    caps.setCapability("browserName", "Android");
	    caps.setCapability("device", "Vivo Y50");
	    caps.setCapability("realMobile", "true");
	    caps.setCapability("os_version", "10.0");
	    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
	    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
	    
	    									//URl : Taken from line number 16                                                     
	    
	    WebDriver wd = new RemoteWebDriver(new java.net.URL(URL), caps);		// Here we r using remote webDriver from BrowserStack(cloud)
		 
	    
	    
		// This "desired capabilities" is communicate between our machine(source code) to cloud.
	    wd.get("https://djangovinoth.pythonanywhere.com/labhome");
	    
	    WebElement loginlink = wd.findElement(By.linkText("Login"));
	    loginlink.click();

	    WebElement username = wd.findElement(By.id("id_username"));
	    username.sendKeys("sadhan");

	    WebElement password = wd.findElement(By.name("password"));
	    password.sendKeys("KAAli@77");

	    password.submit();

	    wd.quit();													// we if missed this quit step. In cloud it will not execute.
	    
	  }

}
