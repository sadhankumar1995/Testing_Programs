package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Precondition {						// we should create class in this name only in real time. For background concept.

// Background: It will execute before each and every scenario. check these steps is present or not.
	
	@Given("verify network")
	public void verifyNetwork()
	{
		System.out.println("network is properly connected");
	}
	
	@And("check excel data")
	public void checkExcwlData()
	{
		System.out.println("Excel data");
	}
	
}
