package excelSheetReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//create excel sheet and pass the path along with name n extension in file
		
		File myfile=new File("C:\\Users\\Admin\\eclipse-workspace\\poi-bin-5.2.2-20220312\\myexcel.xlsx");
		
//using WorkbooFactory class read excel sheet
// How to read string value
		
     String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();

     
     System.out.println(name);
     
 //How to read numeric value(integer value)
     
double number = WorkbookFactory.create(myfile) .getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
     
     System.out.println(number);
     
 //How to read charcter value 
     
    String mychar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
   System.out.println(mychar);  
     
 //How to read boolean value
   
 boolean myValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(2).getCell(1).getBooleanCellValue();
   
   
   System.out.println(myValue);
   
   
   
   
     
     
     
     
	}

}
