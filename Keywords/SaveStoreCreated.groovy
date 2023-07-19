//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
//
//import com.kms.katalon.core.annotation.Keyword
//import com.kms.katalon.core.checkpoint.Checkpoint
//import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.testcase.TestCase
//import com.kms.katalon.core.testdata.TestData
//import com.kms.katalon.core.testobject.TestObject
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
//
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import internal.GlobalVariable
//
//public class SaveStoreCreated {
//	public void saveDataStore(String store_name_random) throws IOException{
////		FileInputStream fis = new FileInputStream("E:\\ExcelSheets\\Book1.xlsx");
////		XSSFWorkbook workbook = new XSSFWorkbook(fis);
////
////		XSSFSheet sheet = workbook.getSheet("Sheet1");
////		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
////		Row row = sheet.createRow(rowCount+1);
////		Cell cell = row.createCell(0);
////		cell.setCellValue(store_name_random);
////		FileOutputStream fos = new FileOutputStream("E:\\ExcelSheets\\Book1.xlsx");
////		workbook.write(fos);
////		fos.close();
//		int startRow = 2;
//		int rowNumber = 1;
//		LocalDateTime now = LocalDateTime.now()
//		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME
//		String nowString = formatter.format(now)
//		//doc file
//		FileInputStream fis = new FileInputStream(path_excell);
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheet("Sheet1");
//		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
//
//		println'rowCount   '+rowCount
//		int number_row = sheet.getPhysicalNumberOfRows();
//
//		XSSFRow row = sheet.createRow(number_row)
//
//		Cell cell1 = row.createCell(0);
//		row.createCell(0).setCellValue(GlobalVariable.url)
//		row.createCell(1).setCellValue(GlobalVariable.store_name_random)		
//		FileOutputStream fos = new FileOutputStream(path_excell);
//		workbook.write(fos);
//		fos.close();
//	}
//}
