package exceptionHandling;

public class A4_TryCatch {

	public static void main(String[] args) {

		try {
		int [] a= new int[2];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		int i=1/0;
		
		}
		catch (Exception e) {
			System.out.println("alert: something went wrong");
			System.out.println(e.getLocalizedMessage());
		}

	}

}
