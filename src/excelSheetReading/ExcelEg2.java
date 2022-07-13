package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File myfile=new File("C:\\Users\\Admin\\eclipse-workspace\\poi-bin-5.2.2-20220312\\myexcel.xlsx");

		Workbook book=WorkbookFactory.create(myfile);
		
		Sheet mysheet = book.getSheet("Sheet1");
		
		Row myrow = mysheet.getRow(1);
		
	    Cell mycell = myrow.getCell(1);
	    
	    System.out.println(mycell.getCellType());
	System.out.println("======================================");    
	    
//code for reading whole data from excel sheet
	
	Sheet mysheet2 = book.getSheet("Sheet2");
	
	for( int i=0;i<=1;i++)    //outer for loop for row
	{
		for(int j=0;j<=2;j++)  //inner for loop for column means cell
		{
			String value = mysheet2.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	System.out.println("===========================================");
	
	
	
	
	
	
	
	
	
	
	
	
	    
	    
	    
	    
	    
		
	}
	

}
