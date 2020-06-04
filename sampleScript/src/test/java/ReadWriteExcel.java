import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWriteExcel {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\mohbhal\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");

			 
		   WebDriver driver = new ChromeDriver();
			FileInputStream file = new FileInputStream(
					new File("C:\\Users\\mohbhal\\eclipse-workspace\\sampleScript\\DataExcel\\XM Split data.xlsx"));

			XSSFWorkbook workbook = new XSSFWorkbook(file);

			XSSFSheet sheet = workbook.getSheetAt(0);
			FileOutputStream out=new FileOutputStream("C:\\Users\\mohbhal\\eclipse-workspace\\sampleScript\\DataExcel\\XM Split data.xlsx");
			workbook.write(out);

			Iterator<Row> rowIterator = sheet.iterator();
			rowIterator.next();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();

				Iterator<Cell> cellIterator = row.cellIterator();

				Cell cell = cellIterator.next();
				

				String path = cell.getStringCellValue();
				System.out.println(path);
				cell = cellIterator.next();
				String url = cell.getStringCellValue();
				System.out.println(url);
				driver.get(url);
				
				try {
				//WebElement ele = driver.findElement(By.xpath("//*[contains(@href,'" + path + "')]"));
					String title=driver.getTitle();
				System.out.println(title);
//				if ()) {
//					
//					
//					cell.setCellValue("Pass");
//					System.out.println("pass");
//					 
//					
//					
//					
//				} else {
//					System.out.println("fail");
//					
//					
//				}
				}
				catch(Exception e) {
					System.out.println("fail");
				}

			}
			
         driver.quit();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
