package variableA;

public class A2_GlobalVariable {
	// it can be declared in class level and also access for entire project
	public static int i=1;
	public static int j=2;
	public static void main(String[] args) 
	{
		
		int k=i+j;
		System.out.println(k);

	}
	public static void add()
	{
		int k=i+j;
	}

}
