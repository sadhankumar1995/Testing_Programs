package StringTest;

public class StartsWithTest {

	public static void main(String[] args) {

        final String a = "Vcentry";
        System.out.println(a.startsWith("Vcen"));
        System.out.println(a.startsWith("vcen"));
        System.out.println(a.startsWith("cen"));
        System.out.println(a.startsWith("V"));
	}

}
