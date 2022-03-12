package dataTypes;

public class CharIntTest {

	public static void main(String[] args) {

		 	final int i = 1;
	        final int j = 49;
	        System.out.println(i + j);
	        final char a = '\u0001';       // ASCII value
	        System.out.println(a);
	        final char b = '1';           // Data type is not an integer. So, The ASCII value of '1' is 49
	        final char c = '1';          // Data type is not an integer. So, The ASCII value of '1' is 49
	        System.out.println(b + c);
	}

}
