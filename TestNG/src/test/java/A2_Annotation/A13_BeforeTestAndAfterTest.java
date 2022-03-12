package A2_Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A13_BeforeTestAndAfterTest {

	@BeforeTest													// Execute Before Start Testing.
	public void systemOn()
	{
		System.out.println("system on");
	}
	
	@AfterTest													// Execute After complete Testing.
	public void systemOff()
	{
		System.out.println("system off");
	}
																			// Note: interview Questions :-  Hierarchy wise
	@BeforeClass
	public void startNetwork()														//	1) @BeforeTest, @AfterTest
	{																				//	2) @BeforeClass, @AfterClass
		System.out.println("network is enable");									//	3) @BeforeMethod, @AfterMethod
	}
	
	@AfterClass
	public void closeNetwork()
	{
		System.out.println("network is disconnected");
	}
	
	@BeforeMethod
	public void browser()
	{
		System.out.println("browser opened");
	}
	
	@AfterMethod
	public void closeBrwoser()
	{
		System.out.println("browser closed");
	}
	
	@Test
	public void login()
	{
		
		System.out.println("login");
	}
	
	@Test(dependsOnMethods ="login")
	public void search()
	{
		System.out.println("search");
	}
	
	@Test(dependsOnMethods ="search")
	public void book()
	{
		System.out.println("book");
	}
	
	@Test(dependsOnMethods ="book")
	public void cancel()
	{
		System.out.println("cancel");
	}
	
}
