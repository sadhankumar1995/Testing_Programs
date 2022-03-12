package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A8_CreateSheet {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\vcentryBatch205\\B1_FileHandling\\File\\vcentry.xlsx");		// Going to the Excel file folder
		FileInputStream fis = new FileInputStream(f);										// clicking (or) pointing the Excel file
		XSSFWorkbook workbook= new XSSFWorkbook(fis);										//opening a Excel file
		XSSFSheet sheet=	workbook.createSheet("sheet7");									// creating a new sheet name as "sheet7"
		XSSFRow row=	sheet.createRow(1);													// directing row
		XSSFCell cell=	row.createCell(1);													// directing column
		cell.setCellValue("vcentry");														// giving input value
		FileOutputStream fos= new FileOutputStream(f);										// clicking (or) pointing the particular cell
		workbook.write(fos);																// writing the value in a particular cell
		fos.close();																		// saving & close
		
	}

}
