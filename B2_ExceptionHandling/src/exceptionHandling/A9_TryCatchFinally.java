package exceptionHandling;

public class A9_TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("login");
		
		try {
		int i=1/0;
		}
		catch (ArithmeticException e) {
			System.out.println("alert: please enter valid input");
			System.out.println(e.getLocalizedMessage());
		}
		finally
		{
			System.out.println("logout");
		}
		System.out.println("try finally completed");

	}

}

