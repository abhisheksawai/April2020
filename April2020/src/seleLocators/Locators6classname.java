package seleLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators6classname {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(4000);
		//driver.findElement(By.className("login_form_input_box")).sendKeys("classnamechek");
		driver.findElement(By.className("inputtext")).sendKeys("classnamechek");
		System.out.println("click on classnamechek");
		
	}
}
