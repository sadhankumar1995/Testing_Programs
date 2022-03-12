package variableA;

public class InstanceVaiables {
	// Instance Variables= without creating the object we cant call the instance variable 
	
	int i=1;
	int j=2;
	public static void main(String[] args) {
		InstanceVaiables a= new InstanceVaiables();
		int k=a.i+a.j;
		System.out.println(k);
	}
	public static void add()

	{
		InstanceVaiables a= new InstanceVaiables();
		int k=a.i+a.j;
	}
}
