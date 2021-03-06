package A7_Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class A23_MultiMethodSingleDataProvider {

	
	String username;		// Here we r Using constructor concept. so, we r declared Globally.
	String password;		// The purpose of using constructor here is: ((("Initialize the local variable and assign the value to global variables")))    
	String ticket1;
	String ticket2;
	

	@Test(priority = 1)
	public void login()
	{
		System.out.println("Enter the username - "+username);
		System.out.println("Enter the password - "+password);
		System.out.println("------------------------------");
	}
	
	@Test(priority = 2)
	public void booking()
	{
		System.out.println("Booking ticket 1 - "+ticket1);
		System.out.println("Booking ticket 2 - "+ticket2);
		System.out.println("==============================");
	}
	
	@Factory(dataProvider = "test_data")																				// By using constructor we can solve this problem. Name should as class name.
	public A23_MultiMethodSingleDataProvider(String USERNAME, String PASSWORD, String TICKET_1, String TICKET_2)
	{
		this.username = USERNAME;
		this.password = PASSWORD;
		this.ticket1 = TICKET_1;
		this.ticket2 = TICKET_2;
	}
	
	@DataProvider(name = "test_data")							// Here in data provider we named this method as a "test_data"
	public static Object[][] initalizedata()					// This method going to provide a data
	{
	Object[][] data = new Object[3][4];
	
	// 1st iteration
	data[0][0] = "abc1";
	data[0][1] = "pass1";
	data[0][2] = "Bus Ticket1";
	data[0][3] = "Train Ticket1";
	
	// 2nd iteration
	data[1][0] = "abc2";
	data[1][1] = "pass2";
	data[1][2] = "Bus Ticket2";
	data[1][3] = "Train Ticket2";
	
	// 3rd iteration
	data[2][0] = "abc3";
	data[2][1] = "pass3";
	data[2][2] = "Bus Ticket3";
	data[2][3] = "Train Ticket3";
	
	return data;
	
	}
}
