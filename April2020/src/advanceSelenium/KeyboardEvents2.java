package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardEvents2 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement searchpune = driver.findElement(By.xpath("//input[@name='q']"));
		
		searchpune.sendKeys("bhushan");
		
		searchpune.sendKeys(Keys.ARROW_DOWN);
		searchpune.sendKeys(Keys.ARROW_DOWN); // first suggestion
		searchpune.sendKeys(Keys.ARROW_DOWN);  //second sugges
		searchpune.sendKeys(Keys.ENTER);
		
		
		
	}

}
