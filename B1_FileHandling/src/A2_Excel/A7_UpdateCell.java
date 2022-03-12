package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A7_UpdateCell {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\vcentryBatch205\\B1_FileHandling\\File\\vcentry.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=	workbook.getSheet("update");
		
		fis.close();
		
		FileOutputStream fos= new FileOutputStream(f);
		sheet.getRow(1).getCell(1).setCellValue("guindy");
		sheet.getRow(1).getCell(2).setCellValue(true);
		workbook.write(fos);
		fos.close();
		
		
	}

}
