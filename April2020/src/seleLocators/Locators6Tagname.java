package seleLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators6Tagname {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.tagName("a")).click();
		
	}
}
