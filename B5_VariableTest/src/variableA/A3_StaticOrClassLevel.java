package variableA;

public class A3_StaticOrClassLevel {
	// static or class level variables can access only with in the same package
	static int i=1;
	static int j=2;
	
	public static void main(String[] args) {
		
		int k=i+j;
		System.out.println(k);
	}
	public static void add()
	{
		int k=i+j;
	}

}
