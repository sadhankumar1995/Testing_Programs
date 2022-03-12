package A4_Encapsulation;

public class A3_Example2Banktest {
	//          1111111111
	private int mobilenumber;

	//                              111111111
	public void setMobilenumber(int mobilenumber) {
		//                  1111111111
		this.mobilenumber = mobilenumber;
	}
	
	public boolean getMobilenumber() {
		// 11111111
		if(mobilenumber==123456)
		{
			return true;
		}
		return false;
	}	
		
	}