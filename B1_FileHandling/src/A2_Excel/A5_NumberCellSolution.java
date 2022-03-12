package A2_Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A5_NumberCellSolution {

	public static void main(String[] args) throws IOException {
		File f= new File("C:\\vcentryBatch205\\B1_FileHandling\\File\\vcentry.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet sheet=	workbook.getSheet("home");
		int row=	sheet.getLastRowNum()+1; // row =3 because we adding +1 in index value
		int column =sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(sheet.getRow(i).getCell(j)!=null)
				{
				if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_STRING)
				{
					String data=sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data+" ");
				}
				else if(sheet.getRow(i).getCell(j).getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
				int data=(int) sheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(data+" ");
				}
		}else {
			System.out.println("empty ");
		}
	}
		System.out.println();	
		}
	}
}
