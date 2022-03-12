package A1_TextFile;

import java.io.File;
import java.io.IOException;

public class A2_FileExits {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\vcentry Batch 205\\B1_FileHandling\\File\\test2.txt");
		
		//f.createNewFile();
		System.out.println(f.exists());
		if(!f.exists())
		{
			f.createNewFile();
		}
	}

}
