package validateLogin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	@Given("check Browser is opened")
	public void checkBrowserIsOpened()
	{
		System.out.println("---------------------Browser opened");
	}
	
	@When("enter the url")
	public void enterTheUrl()
	{
		System.out.println("---------------------enter the url");
	}
	
	@Then("click the login")
	public void clickTheLoginButton()
	{
		System.out.println("---------------------click Login");
	}
	
	@And("verify the login page successfully opened")
	public void verifyLoginPageSuccessfullyOpened()
	{
		System.out.println("---------------------verify Login");
	}
	
	@When("enter the username")
	public void enterTheUserName()
	{
		System.out.println("---------------------enter the user name");
	}
	
	@Then("enter the password")
	public void enterThePassword()
	{
		System.out.println("---------------------enter the password");
	}
	
	@And("validate the home page loaded successfully")		//(( IT WILL NOT THROW AN ERROR )) Here I interchanged order from feature file. This method should come last.
	public void validateTheHomePageLoadedSuccessfully()
	{
		System.out.println("---------------------validate the login");
	}
	
	@And("click the login button")					//(( IT WILL NOT THROW AN ERROR )) Here I interchanged order from feature file. This method should come last before.
	public void clickTheLoginbutton()
	{
		System.out.println("---------------------click login button");
	}
	


}
