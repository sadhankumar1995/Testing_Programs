package constructorTest;

public class A1_ConstructorTest {
	public static int i;
	public static int j;
	
	public static void main(String[] args) {
		System.out.println(i);
		System.out.println(j);
		A1_ConstructorTest d= new A1_ConstructorTest();// d for default constructor
		System.out.println(i);
		System.out.println(j);
		A1_ConstructorTest p= new A1_ConstructorTest(10,10);
		System.out.println(i);
		System.out.println(j);
	}
	public A1_ConstructorTest() // default constructor
	{
		i=5;
		j=5;
	}
	public A1_ConstructorTest(int i,int j) // parametirized constructor
	{
		this.i=i;
		this.j=j; 
	}
}
