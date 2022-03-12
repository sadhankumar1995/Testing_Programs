package StringTest;

public class SubStringTest {

	public static void main(String[] args) {
														// substring return value --> "String"
        final String a = "vcentry";
        System.out.println(a.substring(1, 5));
        System.out.println(a.substring(1, 4));
        System.out.println(a.substring(0, 6));     // 1) Good example
        System.out.println(a.substring(0, 7));   		  // 2) Good example
        System.out.println(a.substring(0, 8));   				  // 3) Good example
	}

}
