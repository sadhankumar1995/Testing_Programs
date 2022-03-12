package throwTest;

public class ThrowTest {

	public static void main(String[] args) throws Exception {
		
		int age=17;
		if(age<18)
		{
			System.out.println("warning : you are not allow to vote");
			throw new Exception("you are under 18");
		}

	}

}
