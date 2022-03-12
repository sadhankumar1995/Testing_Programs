package A2_Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A12_BeforeClassAndAfterClass {
		
		@BeforeClass													// Execute Before a class
		public void startNetwork()
		{
			System.out.println("network is enable");		// This will not consider as a test case.
		}
		
		@AfterClass														// Execute After a class
		public void closeNetwork()
		{
			System.out.println("network is disconnected");		// This will not consider as a test case.
		}

		@Test
		public void login()												// Note: Here we r using only 4 Test Cases. So, Total tests run: 4
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
