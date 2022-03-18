package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pages.LoginPage;

public class LoginTest {		//  page object model so class name should same Here LoginTest.
	
	WebDriver wd;
	
	@Given("check Browser as {string}")					// First data will come here only
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
//		wd.get(url);
		
		LoginPage.pageURL(wd, url);
	}
	
	@And("click the login link")
	public void clickTheLoginLink()
	{
		LoginPage.clickLoginLink(wd);
	}
	
	@Then("verify login page successfully opened")
	public void verifyLoginPageSuccessfullyOpened()
	{
	
		LoginPage.verifyLoginPage(wd);
	}
	
	@When("enter the username as {string}")
	public void enterTheUserNameAs(String username)
	{
		LoginPage.enterLoginUserName(wd, username);
	}
	
	@Then("enter the password as {string}")
	public void enterThePasswordAs(String password)
	{
		LoginPage.enterLoginPassword(wd, password);
	}
	
	@And("click the login button")
	public void clickTheLoginButton()
	{
		LoginPage.clickTheLoginButton(wd);
	}
	
	@And("validate the homepage loaded successfully")
	public void validateTheHomePageLoadedSuccessfully()						// In real time we need to Assert pages to confirm.
	{
		String actual = wd.findElement(By.xpath("/html/body/main/div/div[1]/div/h3/em")).getText();
		Assert.assertEquals("Technologies", actual);
	}

}
