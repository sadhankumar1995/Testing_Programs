package StringTest;

public class EqualsTest {

	public static void main(String[] args) {

        final String a = "vcentry";
        final String b = "vcentry";
        System.out.println(a == b);
        System.out.println(a.equals(b));
        final String c = "Vcentry";
        System.out.println(a == c);
        System.out.println(a.equals(c));
	}

}
