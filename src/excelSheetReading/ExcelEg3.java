package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\Admin\\eclipse-workspace\\poi-bin-5.2.2-20220312\\myexcel.xlsx");

		Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
		
	//wiil give me total row count
		
	int totalnumberOfRows = mySheet.getLastRowNum();
	int rowCount=totalnumberOfRows;
	
	System.out.println("Total number of rows are "+ rowCount);
	
	
short totalNumberOfCells = mySheet.getRow(totalnumberOfRows).getLastCellNum();
	
	int cellcount=totalNumberOfCells-1;
	
	System.out.println("Total number of cells are " +cellcount);
	
for(int i=0;i<=rowCount;i++)   //outer for loop for rows
{
	for(int j=0;j<=cellcount-1;j++)  //inner for loop for columns
	{
		Cell cellValue = mySheet.getRow(i).getCell(j);
		CellType datatype = cellValue.getCellType();
		
		if(datatype==CellType.STRING)
		{
			String value = cellValue.getStringCellValue();
			System.out.println(value+" ");
		}
		
		else if(datatype==CellType.NUMERIC)
		{
			double value = cellValue.getNumericCellValue();
			System.out.println(value+" ");
		}
		
		
		
		
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
