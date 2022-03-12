package conditionTest;

public class A3_SwitchTest {

	public static void main(String[] args) {
		/* int age =50;
		if(age==10)
		{
			System.out.println("age is 10");
		}
		else if(age==20)
		{
			System.out.println("age is 20");
		}
		else if(age==30)
		{
			System.out.println("age is 30");
		}
		else if(age==40)
		{
			System.out.println("age is 40");
		}
		else if(age==50)
		{
			System.out.println("age is 50");
		}
		else
		{
			System.out.println("nothing");
		}
		*/
		
		int age=90;
		switch (age) {
		case 10: 
			System.out.println("age is 10");
			break;
		case 20: 
			System.out.println("age is 20");
			break;
		case 30: 
			System.out.println("age is 30");
			break;
		case 40: 
			System.out.println("age is 40");
			break;
		case 50: 
			System.out.println("age is 50");
			break;
			
		default:
			System.out.println("age is not in range");
			//break;                                                  optionl
			
		}

	}

}
