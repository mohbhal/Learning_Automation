import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataIntoMap {
	
	public static void getDataFromExcel(String sheetName) throws EncryptedDocumentException, InvalidFormatException, IOException {
		Workbook wb=WorkbookFactory.create(new File("C:\\Users\\mohbhal\\eclipse-workspace\\sampleScript\\DataExcel\\map.xlsx"));
		Sheet sh=wb.getSheet(sheetName);
		
		
	}

}
