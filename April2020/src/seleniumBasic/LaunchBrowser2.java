package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser2 {
	
	public static void main(String[] args) {
		
		//System.setp
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		ChromeDriver driver = new ChromeDriver();
		//webdriver driver = new ChromeDriver();
		//WebDriver driver9 = new WebDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		//System.out.println();
		
		//ANY DOUBT WANT TO DISCUSS ?
		
	}

}
