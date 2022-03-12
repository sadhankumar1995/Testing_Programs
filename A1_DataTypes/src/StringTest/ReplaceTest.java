package StringTest;

public class ReplaceTest {

	public static void main(String[] args) {

        final String a = "vcentry";
        System.out.println(a.replace('e', 'a'));
        final String b = "hello vcentry";
        System.out.println(b.replace('e', 'a'));
        System.out.println(a.replace("cen", "enc"));
	}

}
