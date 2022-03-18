package stepDefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class LoginPage {

	WebDriver wd;
	
	@Given("check Browser as {string}")
	public void checkBrowserAs(String browser)
	{
		WebDriverManager.chromiumdriver().setup();
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.manage().window().maximize();
	}
	
	@When("enter the url as {string}")
	public void enterTheUrlAs(String url)
	{
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
	}
	
	@And("click the login link")
	public void clickTheLoginLink()
	{
		wd.findElement(By.linkText("Login")).click();
	}
	
	@Then("verify login page successfully opened")
	public void verifyLoginPageSuccessfullyOpened()
	{
		String Title = wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/legend")).getText();
		
//		Assert.assertEquals("Log in", Title);
		
		SoftAssertions s = new SoftAssertions();						// In real time we need to Assert pages to confirm.
		s.assertThat("Log in".equals(Title));
		s.assertAll();
	}
	
	@When("enter the username as {string}")
	public void enterTheUserNameAs(String username)
	{
		wd.findElement(By.id("id_username")).sendKeys(username);
	}
	
	@Then("enter the password as {string}")
	public void enterThePasswordAs(String password)
	{
		wd.findElement(By.name("password")).sendKeys(password);
	}
	
	@And("click the login button")
	public void clickTheLoginButton()
	{
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
	
	@And("validate the homepage loaded successfully")
	public void validateTheHomePageLoadedSuccessfully()						// In real time we need to Assert pages to confirm.
	{
		String actual = wd.findElement(By.xpath("/html/body/main/div/div[1]/div/h3/em")).getText();
		Assert.assertEquals("Technologies", actual);
	}
	
	//					passing scenario
	
	@After																	// cucumber concept: It will run After all the methods.
	public void tearDown(Scenario s) throws IOException						// Failed scenario it will take screenshot.
	{
		if(s.isFailed())
		{
			File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
			
			FileHandler.copy(src, new File("C:\\Users\\admin\\eclipse-workspace\\F2_ScreenShot\\ScreenShots\\failed.png"));
		}
	}
}
