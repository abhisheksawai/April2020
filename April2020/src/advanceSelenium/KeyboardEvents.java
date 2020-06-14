package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardEvents {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchpune = driver.findElement(By.xpath("//input[@name='q']"));
		
		searchpune.sendKeys("Abhishek");
		
		searchpune.sendKeys(Keys.ARROW_DOWN);
		//Thread.sleep(3000);
		searchpune.sendKeys(Keys.ARROW_DOWN); // first suggestion
		//Thread.sleep(3000);
		searchpune.sendKeys(Keys.ARROW_DOWN);  //second sugges
		Thread.sleep(3000);
		searchpune.sendKeys(Keys.ENTER);
		
		
		
	}

}
