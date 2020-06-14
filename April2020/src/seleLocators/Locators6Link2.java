package seleLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators6Link2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Create a Page")).click();
		
		//driver.findElement(By.partialLinkText("Create")).click();
		
		//driver.findElement(By.partialLinkText("Page")).click();
		
		driver.findElement(By.partialLinkText("ate a Pa")).click();
		
	}
}
