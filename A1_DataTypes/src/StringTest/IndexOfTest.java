package StringTest;

public class IndexOfTest {

	public static void main(String[] args) {

        final String a = "Vcentry";
        System.out.println(a.indexOf(101));		// ASCII Code 101 = e
        System.out.println(a.indexOf(121));			// ASCII Code 121 = y
        System.out.println(a.indexOf(97));				// ASCII Code 97 = a
        System.out.println(a.indexOf(100));					// ASCII Code 100 = d
        System.out.println(a.indexOf('c'));
        System.out.println(a.indexOf('t'));
        
	}

}
