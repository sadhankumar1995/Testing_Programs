package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A2_ReadSingleCell {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\vcentryBatch205\\B1_FileHandling\\File\\vcentry.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=	workbook.getSheet("home");
		//int column =sheet.getRow(0).getLastCellNum();// it wont consider as index 
		String data=sheet.getRow(0).getCell(0).getStringCellValue(); // getcell will consider as index value
	
		System.out.println(data);
	
	
	}

}
