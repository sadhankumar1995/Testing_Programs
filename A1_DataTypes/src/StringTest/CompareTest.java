package StringTest;

public class CompareTest {

	public static void main(String[] args) {

        final String a = "vcentry";
        final String b = "vcentry";
        System.out.println(a.compareTo(b));
        final String c = "Vcentry";
        System.out.println(a.compareTo(c));
        System.out.println(c.compareTo(a));
        final String d = "avenctry";
        System.out.println(a.compareTo(d));
	}

}
