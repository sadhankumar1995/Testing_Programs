package staticAndNonStatic;

public class StaticTest {

	public static void main(String[] args) {		// main method --> always static

		StaticTest a= new StaticTest();           // object creating for to access the non-static method.
		
		System.out.println("object value of a is : " + a);  
		a.add();
		sub();									// static to static <--- object creation not required
		a.calc();	
		
	}
		public void add()                          // non-static method
		{
			System.out.println("add");
		}
		public static void sub()                   // static method
		{
			System.out.println("sub");
		}
		public void calc()                        // non-static method
		{
			add();
			sub();
		}
	}


