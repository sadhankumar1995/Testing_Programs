package StringTest;

public class EndsWithTest {

	public static void main(String[] args) {

        final String a = "Vcentry";
        final String b = "Vcentry";
        System.out.println(a.endsWith("try"));
        System.out.println(a.endsWith("cen"));
        System.out.println(a.endsWith("Try"));
        System.out.println(a.endsWith("sdfsdaf"));
        System.out.println(a.endsWith(b));           //--> Output : False. Why bcoz that ".endsWith" compared the entire String value between a & b.
        											
        											// if i put [final String b = "Vcentry";]   Output : True.
	}

}
