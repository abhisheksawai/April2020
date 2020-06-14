package advanceSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("E:\\World Of Program\\April2020\\ObjectRepository.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		FileInputStream fisconfig = new FileInputStream("E:\\World Of Program\\April2020\\Config.properties");
		Properties configproper = new Properties();
		configproper.load(fisconfig);
		WebDriver driver = null;
		
		if(configproper.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.out.println("give proper browsername currently it is "+configproper.getProperty("browser"));
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aprilbatch");
		System.out.println("printint prop.getProperty(username)");
		
		System.out.println(prop.getProperty("username"));
		
		driver.findElement(By.xpath(prop.getProperty("username"))).sendKeys("aprilbatch");
		
		driver.findElement(By.xpath(prop.getProperty("txt_password_login_facebook"))).sendKeys("passworx");
		
	}
}
