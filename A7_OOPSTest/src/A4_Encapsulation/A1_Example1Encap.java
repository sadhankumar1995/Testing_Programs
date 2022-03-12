package A4_Encapsulation;

public class A1_Example1Encap {

	private String username;
	private int processingamount;
	
	
	
	public String getUsername() throws InterruptedException {
		System.out.println("please wait we are processing ur request");
		Thread.sleep(3000);
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getProcessingamount() {
		
		int oldamount=1000;
		int newamount=oldamount-processingamount;
		System.out.println("customer old amount "+oldamount);
		System.out.println("after detection : "+newamount);

		return processingamount;
	}
	public void setProcessingamount(int processingamount) {
		this.processingamount = processingamount;
	}
	
	
	
	
	
}
