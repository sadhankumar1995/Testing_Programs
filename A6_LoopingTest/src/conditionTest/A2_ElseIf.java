package conditionTest;

public class A2_ElseIf {

	public static void main(String[] args) {
		int age =17;
		String country="Ind";
		String phno="123456789";
		if(age>18)
		{
			System.out.println("Allow to vote");
		}
		else if(country.equals("Aus"))
		{
			System.out.println("He is australian allow to vote");
		}
		else if(phno.equals("123456789"))
		{
			System.out.println("phone no is correct allow to vote");
		}
		else
		{
			System.out.println("he is not allow to vote");
		}
	 }

	}


