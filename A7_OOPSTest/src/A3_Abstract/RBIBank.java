package A3_Abstract;

public abstract class RBIBank {

	public abstract void credit();
	
	public abstract void debit();
	
	
	public static void loan()
	{
		System.out.println("loan from rbi bank abstract class");

	}
	public static void mobileBanking()
	{
		System.out.println("mobile banking rbi bank abstract class");
	}
}
