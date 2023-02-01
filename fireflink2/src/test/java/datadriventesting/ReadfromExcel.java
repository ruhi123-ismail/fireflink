package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadfromExcel {

	public static Object[][] readExcel(String SheetName) throws EncryptedDocumentException, IOException {
		// File file = new File();
		FileInputStream fis = new FileInputStream("./Testdata/testsdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(SheetName);
		int rowcount = sheet.getPhysicalNumberOfRows();
		int colcount = sheet.getRow(0).getPhysicalNumberOfCells();
		//		System.out.println(rowcount);
		//		System.out.println(colcount);

		Object data[][] = new Object[rowcount - 1][colcount];
		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				data[i - 1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}

		//		for (int i = 0; i < rowcount - 1; i++) {
		//			for (int j = 0; j < colcount; j++) {
		//				System.out.println(data[i][j]);
		//			}
		//		}

		return data;
	}

}

//public static void main(String[] args) throws EncryptedDocumentException, IOException {
//	readExcel("Login");
//}
////
//
//{
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//	}