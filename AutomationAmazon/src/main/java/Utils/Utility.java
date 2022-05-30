package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot(WebDriver driver, int testID) throws IOException 
	{
		
      // DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy//mm//ss");
       Date date = new Date();
	   String date1= date.toString().replace(" ", "-").replace(":", " ");
	   File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest = new File("test-output\\Screenshot\\test"+ date1 + testID +".png");
	   FileHandler.copy(source, dest);
//	   FileUtils.copyFile(srcFile

	}
	public static String getDatafromexcelsheet(int row, int cell) throws EncryptedDocumentException, IOException{
	    
    	String data;
		
	    FileInputStream file = new FileInputStream("src\\main\\resources\\testData\\TestData.xlsx");
		Workbook book = WorkbookFactory.create(file);
		data = book.getSheet("TestData").getRow(row).getCell(cell).getStringCellValue();
		/*try {
	
		}
		catch(IllegalStateException e) {
		 double value = book.getSheet("TestData").getRow(row).getCell(cell).getNumericCellValue();
		 data  = Double.toString(value);
		}*/
	       return data;
	
	}
 }
