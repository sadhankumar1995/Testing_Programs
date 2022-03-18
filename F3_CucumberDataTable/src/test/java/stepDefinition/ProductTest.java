package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductTest {
	
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
	
	@And("click the Framework forms")
	public void clickTheFrameWorkForms()
	{
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		wd.findElement(By.id("element44")).click();
	}
	
	@And("click the simple form")
	public void clickTheSimpleForm()
	{
		wd.findElement(By.id("element45")).click();
	}
	
	@When("add product list")
	public void addProductList(DataTable DT)	// By using "DataTable" we an access Datas from Table.
	{
		/*List<List<String>> table = DT.asLists();		// this is not List ---> (((It's Lists ))) so, List<List<String>>
				
		for(int i=0; i<table.size(); i++)
		{
			System.out.println(table.get(i).get(0));	// printing all 0th column values.
			
//													  iterator   we r manually proceeding next rows. using index values.			
			wd.findElement(By.id("id0")).sendKeys(table.get(i).get(0));
			wd.findElement(By.id("id1")).sendKeys(table.get(i).get(1));
			wd.findElement(By.id("id2")).sendKeys(table.get(i).get(2));
			wd.findElement(By.id("id3")).sendKeys(table.get(i).get(3));
			wd.findElement(By.id("id4")).sendKeys(table.get(i).get(4));
			wd.findElement(By.id("id5")).sendKeys(table.get(i).get(5));
			wd.findElement(By.id("idyes")).click();
			wd.findElement(By.id("netbank")).click();
			wd.findElement(By.id("order")).click();
		}*/
		
		
		// OR we can Execute this type also
		
		//			k		V																Map concept is used for Key, Values.
		
		List<Map<String, String>> table = DT.asMaps();				// this is not Map ---> (((It's Maps ))) so, List<Map<String, String>>.
		
		for(int i=0; i<table.size(); i++)
		{
			System.out.println(table.get(i).get("pass the Key"));
			
			wd.findElement(By.id("id0")).sendKeys(table.get(i).get("productname"));		// we r passing Key --> productname 	to get value of that column.
			wd.findElement(By.id("id1")).sendKeys(table.get(i).get("mobile"));			// we r passing Key --> mobile 			to get value of that column.
			wd.findElement(By.id("id2")).sendKeys(table.get(i).get("email"));			// we r passing Key --> email 			to get value of that column.
			wd.findElement(By.id("id3")).sendKeys(table.get(i).get("productcategory"));	// we r passing Key --> productcategory to get value of that column.
			wd.findElement(By.id("id4")).sendKeys(table.get(i).get("quantity"));		// we r passing Key --> quantity 		to get value of that column.
			wd.findElement(By.id("id5")).sendKeys(table.get(i).get("purchaser"));		// we r passing Key --> purchaser 		to get value of that column.
			wd.findElement(By.id("idyes")).click();
			wd.findElement(By.id("netbank")).click();
			wd.findElement(By.id("order")).click();
		}
		
	}

}
