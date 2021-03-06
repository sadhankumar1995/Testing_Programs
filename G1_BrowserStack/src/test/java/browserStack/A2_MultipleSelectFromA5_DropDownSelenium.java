package browserStack;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class A2_MultipleSelectFromA5_DropDownSelenium {

		
		  public static final String AUTOMATE_USERNAME = "sadhankumar_xUFMhX";
		  public static final String AUTOMATE_ACCESS_KEY = "2FwqWLaf1Z8t9MyeaHnz";
		  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
		  public static void main(String[] args) throws MalformedURLException
		  
		  {
		    DesiredCapabilities caps = new DesiredCapabilities();
		    												// This "desired capabilities" is communicate between our machine(source code) to cloud.
		    caps.setCapability("browserName", "Android");
		    caps.setCapability("device", "Google Nexus 9");
		    caps.setCapability("realMobile", "true");
		    caps.setCapability("os_version", "5.1");
		    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
		    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
		
																					//URl : Taken from line number 18 
		    
		    WebDriver wd = new RemoteWebDriver(new java.net.URL(URL), caps);		// Here we r using remote webDriver from BrowserStack(cloud)
		    
		    wd.get("https://djangovinoth.pythonanywhere.com/dropdown");
		    WebElement day = wd.findElement(By.id("days"));
		
		    Select s = new Select(day);  //Here creating a select object.
		
		    s.selectByIndex(0);
		    s.selectByIndex(1);
		    s.selectByIndex(2);
		
		    // For print Output in console
		
		    List<WebElement> options = s.getAllSelectedOptions();	//get all the selected options
		
		    for(int i=0; i<options.size(); i++)
		    {
			String text = options.get(i).getText();
			System.out.println(text);
		    }											// we if missed this quit step. In cloud it will not execute.
		    
		    wd.quit();

	}
	

}
