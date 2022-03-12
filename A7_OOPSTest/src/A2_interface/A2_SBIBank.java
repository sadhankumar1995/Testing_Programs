package A2_interface;

public class A2_SBIBank implements A1_RBIBank {

	public static void main(String[] args) {
		
		A2_SBIBank s= new A2_SBIBank();
		s.credit();
		s.debit();
		s.loan();
		s.lockerSystem();
		
		A1_RBIBank r = new A2_SBIBank();
		r.credit();
		r.debit();
		r.loan();
		
		
		
	}
	public void lockerSystem()
	{
		System.out.println("min 10 lakhs account holder locker facility is available");
	}
	
	@Override
	public void credit() {
	System.out.println("credit logic from sbi");
		
	}

	@Override
	public void debit() {
		System.out.println("debit logic from sbi");
		
	}
	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
	}

	

	

}
