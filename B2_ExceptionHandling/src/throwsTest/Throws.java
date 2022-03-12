package throwsTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Throws {

	public static void main(String[] args) throws IOException {
		getsheet();
	}
	public static void getsheet() throws IOException
	{
		createExcel();
	}
	public static void createExcel() throws IOException
	{
		File f= new File("");
		FileInputStream fis = new FileInputStream(f);
		Properties prop= new Properties();
		prop.load(fis);
	}
}
