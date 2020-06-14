package seleLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.id("email")).sendKeys("karthik");
//		driver.findElement(By.id("pass")).sendKeys("pass@1234");
		
		driver.findElement(By.name("email")).sendKeys("abhishek");
		driver.findElement(By.name("pass")).sendKeys("selenium@123");
		
		driver.findElement(By.id("u_0_b")).click();
		
	}

}
