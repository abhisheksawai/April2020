package advanceSelenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoItDemo {
	
	@Test
	public void uploadfile() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.pdftoword.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Select your file']")).click();
		
		//here auto it code 
		Runtime.getRuntime().exec("C:\\Users\\lenovo\\Desktop\\Current Batch\\Batch Data\\april20autoit\\aprilautoit.exe");
		System.out.println("uploaded file scuss");
		
		
	}

}
