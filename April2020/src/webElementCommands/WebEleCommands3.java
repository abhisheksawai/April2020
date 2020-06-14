package webElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEleCommands3 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//locator which is username 
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhishek");
		WebElement username =driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("bhushan");
		Thread.sleep(3000);  // wait for 3 seconds
		username.clear();
		
		WebElement login =driver.findElement(By.xpath("//input[@value='Log In']"));
		login.click();
		
		
	}

}
