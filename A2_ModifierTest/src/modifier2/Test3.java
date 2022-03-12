package modifier2;

import modifier1.Test1;			 // This class in outside of the package. So, First we should import it.

public class Test3 extends Test1 {		// In "protected method" we can access that method inside & outside of the package. By Using extends keyword.

	public static void main(String[] args) {

		add();     // Calling the method inside main method 
	}

}
