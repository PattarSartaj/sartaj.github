package FecthData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptsForMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream fis = new FileInputStream("./excel/DATA.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","./Software11/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		List<WebElement> all_links = driver.findElements(By.xpath("//a"));
		int count=all_links.size();
		for(int i=0;i<count;i++)
		{
			Row r = sh.createRow(i);
			Cell c = r.createCell(0);
			all_links.get(i).getAttribute("href");
			c.setcellva
		}
	}

}
