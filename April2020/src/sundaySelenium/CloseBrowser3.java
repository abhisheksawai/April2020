package sundaySelenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseBrowser3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Current Batch\\browser exe\\chromedriver81.exe");
		ChromeDriver driver = new ChromeDriver();
		//webdriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//close the browser
		driver.close();
		System.out.println("driver closed browser successfully");
		
	}

}
