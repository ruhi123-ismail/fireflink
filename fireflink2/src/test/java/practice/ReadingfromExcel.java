package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingfromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	RegisterData("Register");
	}
public static Object[][] RegisterData(String sheetName) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./src/test/resources/Testdata/testsdata.xlsx");
	Workbook workbook=WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet(sheetName);
	//workbook.getSheet("Register").getRow(0).getCell(0);
	int rowcount=sheet.getPhysicalNumberOfRows();
	int cellcount=sheet.getRow(0).getPhysicalNumberOfCells();
	Object[][] data=new Object[rowcount-1][cellcount];
	for(int i=1;i<rowcount;i++) {
		for(int j=0;j<cellcount;j++) {
			data[i-1][j]=sheet.getRow(i).getCell(j).toString();
		}
	}
return data;	
}
}