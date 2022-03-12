package A1_inheritance;

public class A3_HDFCBank extends A2_RBIBank {

public static void main(String[] args) {
		
		credit();
		debit();
		//eduloan();        //implementation is optional
		loan();
		personalLoan();

	}
	public static void personalLoan()
	{
		System.out.println("personal loan logic from hdfc");
	}
}
