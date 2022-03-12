package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A1_ExcelTest {

	public static void main(String[] args) throws IOException {
		
		File f= new File("C:\\vcentryBatch205\\B1_FileHandling\\File\\vcentry.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=	workbook.getSheet("home");
		//int row=	sheet.getLastRowNum(); // row=2 because it consider like index value
		int row=	sheet.getLastRowNum()+1; // row =3 because we adding +1 in index value
		int column =sheet.getRow(0).getLastCellNum();
		System.out.println("total row="+row);
		System.out.println("total column="+column);
	}

}
