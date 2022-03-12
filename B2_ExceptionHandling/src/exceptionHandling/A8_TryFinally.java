package exceptionHandling;

public class A8_TryFinally {

	public static void main(String[] args) {
		System.out.println("program starts");
		
		try {
			System.out.println("login ");
		int i=1/0; // net disconnected
		}
	
		finally // execute the final block before throwing the Exception
		{
			System.out.println("log out");
		}
		System.out.println("try finally completed");
	}

}
