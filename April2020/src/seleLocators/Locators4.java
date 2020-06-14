package seleLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xpathsending");
		Thread.sleep(4000);
		driver.findElement(By.className("mouseOut")).click();
		System.out.println("click on mouseout");
		
	}
}
