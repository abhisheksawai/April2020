package advanceSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReading {
	//C:\Users\lenovo\Desktop\Current Batch\log4j jar\aprilbatchexcel.xlsx
	public static void main(String[] args) throws Exception {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	File src=new File("C:\\Users\\lenovo\\Desktop\\Current Batch\\log4j jar\\aprilbatchexcel.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheetAt(0);
	
	String username = sh1.getRow(1).getCell(1).getStringCellValue();
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
	
	int lastrow = sh1.getLastRowNum();
	System.out.println("lastrow  is "+lastrow);
	
	
}
}
