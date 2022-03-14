package A8_ScreenShot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A59_CropTheImage {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		// For crop the image we need to use 3 things.
		// 1) Point
		// 2) Dimension
		// 3) TakeScreenshot
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		WebElement logo=	wd.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[2]"));		

// 1
		Point p = logo.getLocation();
		int x = p.x;
		int y = p.y;
// 2		
		Dimension d = logo.getSize();
		int h = d.height;
		int w = d.width;
		
		Thread.sleep(2000);
// 3
		File src = ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);

		BufferedImage pic =ImageIO.read(src);															 // ImageIO read the screenshot
		BufferedImage cropimage =	pic.getSubimage(x, y, w, h);										// Then ploting.
		ImageIO.write(cropimage, "png", src);  // png format in Double quotes. Bcoz, that is a string.	// Then croped image png from  the file src.
		
		File Picture = new File("C:\\Users\\admin\\eclipse-workspace\\D1_WebDriverTest\\ScreenShot\\google2.png");
		FileHandler.copy(src, Picture);
		
	}

}
