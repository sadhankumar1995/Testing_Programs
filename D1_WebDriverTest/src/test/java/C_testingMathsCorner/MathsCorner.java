package C_testingMathsCorner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MathsCorner {
	
	public static void main (String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=16050647728754572197&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040218&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiAieWOBhCYARIsANcOw0wk7vWJ9ZaYflXiQpKbT_fhCdKqw5X6oVcLwH3l90DoWiColfLA__caAhVoEALw_wcB");
		
		WebElement search = wd.findElement(By.name("field-keywords"));
		search.sendKeys("healthsense weighing machine");
		search.submit();
		
		
	}

}
