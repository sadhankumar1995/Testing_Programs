package A7_Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A21_SingleMethodSingleDataProvider {

	@Test(dataProvider = "test_data")										     // By Calling data provider name. We r going to access the data
	public void login(String browser,String url,String username,String password)
	{
		System.out.println("open browser   -- " + browser);
		System.out.println("Enter url      -- " + url);
		System.out.println("Enter username -- " + username);
		System.out.println("Enter password -- " + password);
		System.out.println("------------------------------");
	}
	
		@DataProvider(name = "test_data")							// Here in data provider we named this method as a "test_data"
	
		// modifier   returnType		method name
		   public     Object[][] 		initalizedata()					// This method going to provide a data
	{
		
		// single data pass single dimension	
		//						[iterator = How many times] [data = how much data]
		// Object[][] i=new Object[2][4];
		
		Object[][] data = new Object[3][4];
		
		// 1st iteration
		data[0][0]="chrome";
		data[0][1]="google";
		data[0][2]="abc1";
		data[0][3]="pass1";		
		
		// 2nd iteration
		data[1][0]="Firefox";
		data[1][1]="firefox";
		data[1][2]="abc2";
		data[1][3]="pass2";	
		
		// 3rd iteration
		data[2][0]="Edge";
		data[2][1]="edge";
		data[2][2]="abc3";
		data[2][3]="pass3";
		
		return data;			// Method if not void ----> Add return
		
	}
}
