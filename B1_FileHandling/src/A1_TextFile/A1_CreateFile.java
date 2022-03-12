package A1_TextFile;

import java.io.File;
import java.io.IOException;

public class A1_CreateFile {

	public static void main(String[] args) throws IOException  {
		
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\B1_FileHandling\\File\\test.txt");       // Here we should use this one "\\"

		f.createNewFile();             // To get path Right click on Folder ---> Properties ----> Copy the Location there.
		
		                               // Right click on project name and Refresh it ----> U can able see "test" file  under File Folder.
	}

}

