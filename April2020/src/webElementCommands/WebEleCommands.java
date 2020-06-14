package webElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEleCommands {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//locator which is username 
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhishek");
		WebElement username =driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("bhushan");
		
	}

}
