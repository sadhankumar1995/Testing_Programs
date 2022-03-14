package A8_ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A50_NormalScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.google.com/");
																			// MUGUP These 3 Lines
		
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE); 										 // Here both wd & screenchot are interfaces so, Typecasting() is done. and Returntype is "FILE".
		
		File pic1 = new File("C:\\Users\\admin\\eclipse-workspace\\D1_WebDriverTest\\ScreenShot\\sadhan.png");  // New location is created to store.
		
		FileHandler.copy(src, pic1); 																			 // Here filehandler is used copy from 1 to other.
		
	}

}
