package advanceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingDemo {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver83.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.paytm.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		//jse.executeScript("scroll(0, 3000);");  //vertical
		jse.executeScript("window.scrollBy(0,3100)");
		
	}

}
