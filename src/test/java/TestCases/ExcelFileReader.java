package TestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelFileReader {

	@DataProvider(name = "dataProvider")
	public static void main(String arg[]) throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\admin12\\Desktop\\Data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int lastRow = sheet.getLastRowNum();
		int lastColNum = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[lastRow][lastColNum]; 
		
		for(int row = 0; row<lastRow ;row++ )
		{
					XSSFRow currentRow = sheet.getRow(row);
					
					data[row][0] = currentRow.getCell(0).toString();
					data[row][1] = currentRow.getCell(1).toString();
		}
		
	}
}
