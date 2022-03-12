package A7_Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A22_MultiMethodMultiData {

	@Test(priority = 1, dataProvider = "login")							// By Calling data provider name. We r going to access the data
	public void login(String username,String password)
	{
		System.out.println("Enter the username - "+username);
		System.out.println("Enter the password - "+password);
		System.out.println("------------------------------");
	}
	
	@Test(priority = 2, dataProvider = "booking")						// By Calling data provider name. We r going to access the data
	public void booking(String ticket1,String ticket2)
	{
		System.out.println("Booking ticket 1 - "+ticket1);
		System.out.println("Booking ticket 2 - "+ticket2);
		System.out.println("==============================");
	}
	
	@DataProvider(name = "login")				// Here in data provider we named this method as a "login"
	public Object[][] logindata()				// This method going to provide a data
	{

		Object[][] data=new Object[2][2];
		
		//1st iteration
		data[0][0]="abc1";
		data[0][1]="pass1";
		
		//2nd iteration
		data[1][0]="abc2";
		data[1][1]="pass2";
	
		return data;
	}
	
	@DataProvider(name = "booking")				// Here in data provider we named this method as a "booking"
	public Object[][] bookingdata()				// This method going to provide a data
	{
		Object[][] data=new Object[2][2];

		//1st iteration
		data[0][0]="Bus ticket1";
		data[0][1]="Train ticket1";

		//2nd iteration
		data[1][0]="Bus ticket2";
		data[1][1]="Train ticket2";
	
		return data;
	}
}
