package advanceSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReading4 {
	//C:\Users\lenovo\Desktop\Current Batch\log4j jar\aprilbatchexcel.xlsx
	public static void main(String[] args) throws Exception {
	
	
	File src=new File("C:\\Users\\lenovo\\Desktop\\Current Batch\\log4j jar\\aprilbatchexcel.xlsx");
	
	FileInputStream fis=new FileInputStream(src);
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	
	XSSFSheet sh1 = wb.getSheetAt(1); // sheet acesing
	
	String username = sh1.getRow(1).getCell(1).getStringCellValue();
	
	System.out.println(username);
	
	int lastrow = sh1.getLastRowNum();
	System.out.println("lastrow  is "+lastrow);
	
	int firstrow = sh1.getFirstRowNum();
	System.out.println("firstrow   is "+firstrow);
	
	int physicalrow = sh1.getPhysicalNumberOfRows();
	System.out.println("getPhysicalNumberOfRows is ->"+physicalrow);
	
	int colnum = sh1.getRow(1).getPhysicalNumberOfCells();
	System.out.println(" sh1.getRow(1).getPhysicalNumberOfCells()-->> " + colnum);
	
	int lastcell = sh1.getRow(1).getLastCellNum();
	System.out.println("sh1.getRow(1).getLastCellNum();->> "+lastcell);
	
	System.out.println("-----------------");
	
	
	
	
	
	
	
}
}
