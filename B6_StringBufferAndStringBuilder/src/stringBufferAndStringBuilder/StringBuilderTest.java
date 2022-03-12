package stringBufferAndStringBuilder;

public class StringBuilderTest {

	public static void main(String[] args) {
		String a="vcentry";
		a.concat("technologies");
		System.out.println(a);
		
		StringBuilder sb= new StringBuilder("vcentry");
		sb.append("technologies");
		System.out.println(sb);
		
	}

}
