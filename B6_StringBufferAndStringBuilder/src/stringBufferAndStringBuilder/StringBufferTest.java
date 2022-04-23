package stringBufferAndStringBuilder;

public class StringBufferTest {

	public static void main(String[] args) {
		
		String a="vcentry";
		a.concat("technologies");
		System.out.println(a);
		
		StringBuffer sb= new StringBuffer(a);
		sb.append("technologies");
		System.out.println(sb);
		
		
		
	}

}
