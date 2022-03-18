package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {

	@Given("check Browser as {string}")									// {string} --> we r getting String data.(Here in cucumber small "s" for string)
	public void checkBrowserIsOpened(String browser)					// Passing in parameter  // But here Cap "S"
	{
		System.out.println("open the browser -------------"+browser);
	}
	
	@When("enter the url as {string}")									// {string} --> we r getting String data.(Here in cucumber small "s" for string)
	public void enterTheUrl(String url)									// Passing in parameter  // But here Cap "S"
	{
		System.out.println("enter the url ----------------"+url);
	}
	
	@And("click the login button")
	public void clickTheLoginButton()
	{
		System.out.println("------------------------------click Login");
	}
	
	@Then("verify login page successfully opened")
	public void verifyLoginPageSuccessfullyOpened()
	{
		System.out.println("------------------------------verify Login");
	}
	
	@When("enter the username as {string}")								// {string} --> we r getting String data.(Here in cucumber small "s" for string)
	public void enterTheUserName(String username)						// Passing in parameter  // But here Cap "S"
	{
		System.out.println("enter the username -----------"+username);
	}
	
	@Then("enter the password as {string}")								// {string} --> we r getting String data.(Here in cucumber small "s" for string)
	public void enterThePassword(String password)						// Passing in parameter  // But here Cap "S"
	{
		System.out.println("enter the password------------"+password);
	}
	
	@And("Click the login button")
	public void clickTheLoginbutton()
	{
		System.out.println("------------------------------click login button");
	}
	
	@And("validate the homepage loaded successfully")
	public void validateTheHomePageLoadedSuccessfully()
	{
		System.out.println("------------------------------validate the login");
		System.out.println();
	}
	
}
