package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivercommand {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.paytm.com/");
		driver.manage().window().maximize();
		
		//how to close browser
		driver.close();
		
		
	
	}
}
