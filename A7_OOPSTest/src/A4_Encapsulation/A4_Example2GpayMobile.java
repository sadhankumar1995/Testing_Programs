package A4_Encapsulation;

public class A4_Example2GpayMobile {

	public static void main(String[] args) {
		A3_Example2Banktest b= new A3_Example2Banktest();
		b.setMobilenumber(123456);
		if(b.getMobilenumber())
		{
			System.out.println("Mobile number validated");
		}
		else
		{
			System.out.println("mobile number is invalid");
		}
	}

}
