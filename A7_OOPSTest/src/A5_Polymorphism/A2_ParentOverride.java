package A5_Polymorphism;

public class A2_ParentOverride extends GrandFatherOverride {

	public static void add()
	{
		
		System.out.println("i am from parent add");
	}
	//                         2      2
	public static void add(int i, int j)
	{
		System.out.println(i+j+"from parent");
	}
	
	
	
}
